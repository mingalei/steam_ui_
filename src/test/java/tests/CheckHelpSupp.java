package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HelpSupport;
import pages.components.LangPanel;
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

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка раздела 'Я не могу вспонить имя или пароль'")
    @Test
    void helpLogPageCheckTest() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkEn());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.helpMainPageSelect());
        step("Переходим на главную страницу поддержки", () -> helpSupport.helpSuppSelect());
        step("Переходим и проверяем наличие раздела 'Я не могу вспонить имя или пароль'", () -> helpSupport.helpLoginCheck());

    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка раздела 'Мой аккаунт украли'")
    @Test
    void helpAccountPageCheckTest() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkEn());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.helpMainPageSelect());
        step("Переходим на главную страницу поддержки", () -> helpSupport.helpSuppSelect());
        step("Переходим и проверяем наличие раздела 'Мой аккаунт украли'", () -> helpSupport.helpAccountCheck());

    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка раздела 'Письмо с кодом не пришло'")
    @Test
    void helpGuardPageCheckTest() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkEn());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.helpMainPageSelect());
        step("Переходим на главную страницу поддержки", () -> helpSupport.helpSuppSelect());
        step("Переходим и проверяем наличие раздела 'Письмо с кодом не пришло'", () -> helpSupport.helpSupportCheck());

    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка раздела 'Мобильный аутентификатор удалён или утерян'")
    @Test
    void helpMobileAuthCheckTest() {
        step("Открываем главную страницу Steam", () -> workshop.openSteamLinkEn());
        step("Меняем локализацию сайта", () -> changeLang.languagePanel()
                .langChangeRu());
        step("Переходим в рездел Поддержка", () -> helpSupport.helpMainPageSelect());
        step("Переходим на главную страницу поддержки", () -> helpSupport.helpSuppSelect());
        step("Переходим и проверяем наличие раздела 'Мобильный аутентификатор удалён или утерян'", () -> helpSupport.helpMobileAuthCheck());

    }
}
