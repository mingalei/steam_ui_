package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LangPanel;
import pages.Workshop;


@Tag("smoke")
@Tag("workshop")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка добавления и удаления игры в корзину")
public class WorkshopCheck extends TestBase {

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
