package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Cart;
import pages.LangPanel;
import utils.Variables;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("smoke")
@Tag("cart")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка добавления и удаления игры в корзину")
public class AddAndRemoveToCart extends TestBase {

    Cart cart = new Cart();
    LangPanel changeLang = new LangPanel();


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Добавление игру в корзину")
    void addToCart() {
        Variables games = new Variables();
        step("Открываем главную страницу Steam", () -> cart.openMainPage());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Вводим игру в поиск", () -> cart.marketSearch()
                .setGame(games.setGame));
        cart.selectGame(games.setGame);
        step("Добавляем игру в корзину", () -> cart.addToCart());
        step("Проверяем, что игра была добавлена в корзину", () -> cart.gameInCart());
        step("Удаляем игру из корзины", () -> cart.removeGameCart());
        step("Проверяем, что игра была удалена из корзины", () -> cart.removeCheck());
    }

    @Test
    @DisplayName("Удаление игры в козрзину после добавления")
    void removeFromCart() {
        Variables games = new Variables();
        step("Открываем главную страницу Steam", () -> cart.openMainPage());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Вводим игру в поиск", () -> cart.marketSearch()
                .setGame(games.setGame));
        cart.selectGame(games.setGame);
        step("Добавляем игру в корзину", () -> cart.addToCart());
        step("Проверяем, что игра была добавлена в корзину", () -> cart.gameInCart());
        step("Удаляем игру из корзины", () -> cart.removeGameCart());
        step("Проверяем, что игра была удалена из корзины", () -> cart.removeCheck());
    }
}
