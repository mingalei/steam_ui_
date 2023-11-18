package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Workshop;


public class WorkshopCheck extends BaseTest {

    Workshop workshop = new Workshop();

    @DisplayName("Проверка наличия мастерской Steam")
    @Test
    void workShopCheck() {

        workshop.openSteamLink()
                .communityEl()
                .workshopSel()
                .workshopAll()
                .checkNews()
                .aboutWork()
                .insrtuct();
    }
}
