package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Cart;
import pages.LangPanel;
import utils.Variables;


public class AddAndRemoveToCart extends BaseTest {

    Cart Cart = new Cart();
    LangPanel ChangeLang = new LangPanel();


    @DisplayName("Добавление игры в корзину")
    @Test
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

    //@Owner("Mingaleev Aydar")
    //@Epic(value = "Testing of Steam website")
    // @DisplayName("Удаление игры из корзины")
    @Test
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
