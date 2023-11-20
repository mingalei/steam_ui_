package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Cart;
import pages.LangPanel;
import utils.Variables;

@Tag("smoke")
@Tag("cart")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка добавления и удаления игры в корзину")
public class AddAndRemoveToCart extends TestBase {

    Cart Cart = new Cart();
    LangPanel ChangeLang = new LangPanel();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Добавление игры в корзину")
    void addToCart() {
        Variables games = new Variables();
        Cart.openMainPage();
        ChangeLang.languagePanel()
                .langChangeRu();
        Cart.marketSearch()
                .setGame(games.setGame)
                .selectGame(games.setGame)
                .addToCart()
                .gameInCart();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Удаление игры из корзины")
    void removeCart() {
        Variables games = new Variables();
        Cart.openMainPage();
        ChangeLang.languagePanel()
                .langChangeRu();
        Cart.marketSearch()
                .setGame(games.setGame)
                .selectGame(games.setGame)
                .addToCart()
                .gameInCart();
        Cart.openCart()
                .removeGameCart()
                .removeCheck();
    }
}
