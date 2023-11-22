package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class Cart extends TestBase {


    SelenideElement
            marketSearch = $("#store_nav_search_term"),
            addToCart = $(".btn_green_steamui"),
            gameInCart = $(".cart_status_message"),
            removeGameCart = $(".remove_link");


    public Cart openMainPage() {
        open("/?l=english");
        return this;
    }

    public Cart marketSearch() {
                marketSearch.click();
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
        addToCart.click();
        return this;
    }

    public Cart gameInCart() {
        gameInCart.shouldHave(Condition.text("Ваш товар был добавлен"));
        return this;
    }

    public Cart removeGameCart() {
        removeGameCart.click();
        return this;
    }

    public Cart removeCheck() {
        gameInCart.shouldHave(Condition.text("Ваш товар был удалён!"));
        return this;
    }


}
