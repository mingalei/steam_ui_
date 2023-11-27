package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Workshop {
    SelenideElement
            instuctions = $(".instructionsTitle"),
            workshopThis = $x("//a[contains(text(),'Просмотреть все доступные мастерские')]"),
            community = $x("//a[contains(text(),'СООБЩЕСТВО')]"),
            workshopSelect = $x("//span[contains(text(),'Мастерская')]"),
            lastNews = $(".mainSectionHeader"),
            aboutWorkshop = $x("//span[contains(text(),'О мастерской')]");

    public Workshop openSteamLinkRu() {
        open("/?l=russian");
        return this;
    }
    public Workshop openSteamLinkEn() {
        open("/?l=english");
        return this;
    }

    public Workshop communityElSelect() {
        community.click();
        return this;
    }

    public Workshop workshopSelect() {
        workshopSelect.click();
        return this;
    }

    public Workshop openWorkshopAll() {
        workshopThis.click();
        return this;
    }

    public Workshop newsPageCheck() {
        lastNews.shouldHave(Condition.text("ПОСЛЕДНИЕ НОВОСТИ МАСТЕРСКОЙ"));
        return this;
    }

    public Workshop aboutWorkSelct() {
        aboutWorkshop.click();
        return this;
    }

    public Workshop insrtuctPageCheck() {
        instuctions.shouldHave(Condition.text("Как это работает"));
        return this;
    }
}

