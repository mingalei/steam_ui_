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

    public Workshop openSteamLink() {
        open("/?l=english");
        return this;
    }

    public Workshop communityEl() {
        community.click();
        return this;
    }

    public Workshop workshopSel() {
        workshopSelect.click();
        return this;
    }

    public Workshop workshopAll() {
        workshopThis.click();
        return this;
    }

    public Workshop checkNews() {
        lastNews.shouldHave(Condition.text("ПОСЛЕДНИЕ НОВОСТИ МАСТЕРСКОЙ"));
        return this;
    }

    public Workshop aboutWork() {
        aboutWorkshop.click();
        return this;
    }

    public Workshop insrtuct() {
        instuctions.shouldHave(Condition.text("Как это работает"));
        return this;
    }
}

