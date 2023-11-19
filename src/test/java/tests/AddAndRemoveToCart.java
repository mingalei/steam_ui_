package tests;


import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Cart;
import utils.Variables;


public class AddAndRemoveToCart extends BaseTest {

    Cart mainPage = new Cart();


    @DisplayName("Добавление игры в корзину")
    @Test
    void addToCart() {
        Variables games = new Variables();
        mainPage.openMainPage()
                .marketSearch()
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
        mainPage.openCart()
                .removeGameCart()
                .removeCheck();
    }
}
