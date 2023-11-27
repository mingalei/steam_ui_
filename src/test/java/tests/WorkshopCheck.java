package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.LangPanel;
import pages.Workshop;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


@Tag("smoke")
@Tag("workshop")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка наличия мастерской, нужного заголовка")
public class WorkshopCheck extends TestBase {

    LangPanel changeLang = new LangPanel();
    Workshop workshop = new Workshop();

    @DisplayName("Проверка наличия заголовка 'Последние новости мастеркой' в главной странице мастерской")
    @Test
    void WorkshopTitleCheckTest() {
        step("Переходим на главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Переходим во вкладку Сообщество", () -> workshop.communityElSelect());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu()); //Смена локализации для выбора нужного элемента
        step("Переходи во вкладку Мастерская", () -> workshop.workshopSelect());
        step("Открываем все доступные мастерские", () -> workshop.openWorkshopAll());
        step("Проверяем наличие заголовка 'Последние новости мастеркой'", () -> workshop.newsPageCheck());
    }

    @DisplayName("Проверка наличия заголовка во вкладке 'О мастерской'")
    @Test
    void AboutWorkshopTest() {
        step("Переходим на главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Переходим во вкладку Сообщество", () -> workshop.communityElSelect());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu()); //Смена локализации для выбора нужного элемента
        step("Переходи во вкладку Мастерская", () -> workshop.workshopSelect());
        step("Открываем все доступные мастерские", () -> workshop.openWorkshopAll());
        step("Проверяем наличие заголовка 'Последние новости мастеркой'", () -> workshop.newsPageCheck());
        step("Открываем вкладку 'О мастерской'", () -> workshop.aboutWorkSelct());
        step("Проверяем наличие необходимого текста", () -> workshop.insrtuctPageCheck());
    }

}
