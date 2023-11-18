package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class Cart extends BaseTest {


    SelenideElement
            marketSearch = $("#store_nav_search_term"),
            addToCart = $(".btn_green_steamui"),
            gameInCart = $(".cart_status_message"),
            removeGameCart = $(".remove_link");


    public Cart openMainPage() {
        step("Открываем главную страницу Steam", () ->
                open("https://store.steampowered.com/"));

        return this;
    }

    public Cart openCart() {
        step("Открываем главную страницу Steam", () ->
                open("https://store.steampowered.com/cart/"));

        return this;
    }

    public Cart marketSearch() {
        step("", () ->
                marketSearch.click());

        return this;
    }

    public Cart setGame(String value) {
        marketSearch.setValue(value).pressEnter();
        return this;
    }

    public Cart selectGame(String game1) {
        step("Открываем результаты поиска: " + game1, () ->
                $x("//span[contains(@class,'title') and text()='" + game1 + "']").click());
        return this;
    }

    public Cart addToCart() {
        step("Добавляем игру в корзину", () ->
                addToCart.click());
        return this;
    }

    public Cart gameInCart() {
        step("Проверка, что игра была добавлена в корзину", () ->
                gameInCart.shouldHave(Condition.text("Ваш товар был добавлен")));

        return this;
    }

    public Cart removeGameCart(){
        step("Удаляем игры из корзины", () ->
        removeGameCart.click());

        return this;
    }
    public Cart removeCheck(){
        step("Проверяем, что товар удалён", () ->
                gameInCart.shouldHave(Condition.text("Ваш товар был удалён!")));

        return this;
    }


}
