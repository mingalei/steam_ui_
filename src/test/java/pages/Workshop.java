package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class Workshop {
    SelenideElement
            instuctions = $(".instructionsTitle"),
            workshopThis = $x("//a[contains(text(),'Просмотреть все доступные мастерские')]"),
            community = $x("//a[contains(text(),'СООБЩЕСТВО')]"),
            workshopSelect = $x("//span[contains(text(),'Мастерская')]"),
            lastNews = $(".mainSectionHeader"),
            aboutWorkshop = $x("//span[contains(text(),'О мастерской')]");

    public Workshop openSteamLink() {
        step("Открываем главную страницу Steam", () ->
                open("https://store.steampowered.com/"));
        return this;
    }

    public Workshop communityEl() {
        step("", () ->
                community.click());
        return this;
    }

    public Workshop workshopSel() {
        step("", () ->
                workshopSelect.click());
        return this;
    }

    public Workshop workshopAll() {
        step("", () ->
                workshopThis.click());
        return this;
    }

    public Workshop checkNews() {
        step("", () ->
                lastNews.shouldHave(Condition.text("ПОСЛЕДНИЕ НОВОСТИ МАСТЕРСКОЙ")));
        return this;
    }

    public Workshop aboutWork() {
        step("", () -> {
            aboutWorkshop.click();
        });
        return this;
    }

    public Workshop insrtuct() {
        step("", () -> {
            instuctions.shouldHave(Condition.text("Как это работает"));
        });
        return this;
    }
}

