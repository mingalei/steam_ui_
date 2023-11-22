package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LangPanel;
import pages.Workshop;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


@Tag("smoke")
@Tag("workshop")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка перехода в матсерскую")
public class WorkshopCheck extends TestBase {

    LangPanel changeLang = new LangPanel();
    Workshop workshop = new Workshop();

    @DisplayName("Проверка мастерской Steam")
    @Test
    void workShopCheck() {
        step("Переходим на главную страницу Steam", () -> workshop.openSteamLinkEn());
        step("Переходим во вкладку Сообщество", () -> workshop.communityEl());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu()); //Смена локализации для выбора нужного элемента
        step("Переходи во вкладку Мастерская", () -> workshop.workshopSel());
        step("Открываем все доступные мастерские", () -> workshop.workshopAll());
        step("Проверяем наличие заголовка 'Последние новости мастеркой'", () -> workshop.checkNews());
        step("Открываем вкладку 'О мастерской'", () -> workshop.aboutWork());
        step("Проверяем наличие необходимого текста", () -> workshop.insrtuct());
    }
}
