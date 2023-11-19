package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LangPanel;
import pages.Workshop;


public class WorkshopCheck extends BaseTest {

    LangPanel ChangeLang = new LangPanel();
    Workshop workshop = new Workshop();

    @DisplayName("Проверка наличия мастерской Steam")
    @Test
    void workShopCheck() {

        workshop.openSteamLink()
                .communityEl();
        ChangeLang.languagePanel()
                .langChangeRu();
        workshop.workshopSel()
                .workshopAll()
                .checkNews()
                .aboutWork()
                .insrtuct();
    }
}
