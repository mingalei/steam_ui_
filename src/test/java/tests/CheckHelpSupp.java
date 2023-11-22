package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HelpSupport;
import pages.LangPanel;
import pages.Workshop;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("smoke")
@Tag("helpsupport")
@Owner("Aydar Mingaleev")
@Epic(value = "Проверка сайта steam")
@Feature(value = "Проверка перехода в матсерсую и поиск необходимого текста")
public class CheckHelpSupp extends TestBase {

    Workshop workshop = new Workshop();
    HelpSupport helpSupport = new HelpSupport();
    LangPanel changeLang = new LangPanel();

    @DisplayName("Проверка раздела 'Я не могу вспонить имя или пароль'")
    @Test
    void hLog() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.hMainSupp());
        step("Переходим на главную страницу поддержки", () -> helpSupport.hSupport());
        step("Переходим и проверяем наличие раздела 'Я не могу вспонить имя или пароль'", () -> helpSupport.hLog());

    }

    @DisplayName("Проверка раздела 'Мой аккаунт украли'")
    @Test
    void hAcc() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.hMainSupp());
        step("Переходим на главную страницу поддержки", () -> helpSupport.hSupport());
        step("Переходим и проверяем наличие раздела 'Мой аккаунт украли'", () -> helpSupport.hAccount());

    }

    @DisplayName("Проверка раздела 'Письмо с кодом не пришло'")
    @Test
    void hGuard() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.hMainSupp());
        step("Переходим на главную страницу поддержки", () -> helpSupport.hSupport());
        step("Переходим и проверяем наличие раздела 'Письмо с кодом не пришло'", () -> helpSupport.hGuard());

    }

    @DisplayName("Проверка раздела 'Мобильный аутентификатор удалён или утерян'")
    @Test
    void hAuth() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkRu());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.hMainSupp());
        step("Переходим на главную страницу поддержки", () -> helpSupport.hSupport());
        step("Переходим и проверяем наличие раздела 'Мобильный аутентификатор удалён или утерян'", () -> helpSupport.hMobAuth());

    }


}
