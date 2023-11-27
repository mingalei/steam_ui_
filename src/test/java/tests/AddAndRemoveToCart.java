package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Cart;
import pages.components.LangPanel;
import data.TestData;

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
    void addToCartTest() {
        TestData testData = new TestData();
        step("Открываем главную страницу Steam", () -> cart.openMainPage());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Вводим игру в поиск", () -> cart.marketSearch()
                .setGame(testData.setGame));
        cart.selectGame(testData.setGame);
        step("Добавляем игру в корзину", () -> cart.addToCart());
        step("Проверяем, что игра была добавлена в корзину", () -> cart.gameInCart());
        step("Удаляем игру из корзины", () -> cart.removeGameCart());
        step("Проверяем, что игра была удалена из корзины", () -> cart.removeCheck());
    }

    @Test
    @DisplayName("Удаление игры в козрзину после добавления")
    void removeFromCartTest() {
        TestData testData = new TestData();
        step("Открываем главную страницу Steam", () -> cart.openMainPage());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Вводим игру в поиск", () -> cart.marketSearch()
                .setGame(testData.setGame));
        cart.selectGame(testData.setGame);
        step("Добавляем игру в корзину", () -> cart.addToCart());
        step("Проверяем, что игра была добавлена в корзину", () -> cart.gameInCart());
        step("Удаляем игру из корзины", () -> cart.removeGameCart());
        step("Проверяем, что игра была удалена из корзины", () -> cart.removeCheck());
    }
}
