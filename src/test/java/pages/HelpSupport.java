package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HelpSupport {

    SelenideElement
            helpLogin = $x("//span[contains(text(),'имя или пароль')]"),
            helpAcc = $x("//span[contains(text(),'украли')]"),
            helpGuard = $x("//span[contains(text(),'не пришло')]"),
            helpMobAuth = $x("//span[contains(text(),'утерян')]"),
            mainSupport = $x("//a[contains(text(),'ПОДДЕРЖКА')]"),
            helpSupp = $x("//span[contains(text(),'Помогите')]"),
            helpPageTitle = $(".help_page_title");


    public HelpSupport helpLoginCheck() {
        helpLogin.click();
        helpPageTitle.shouldHave(Condition.text("Я не могу вспомнить имя (логин) или пароль моего аккаунта Steam"));
        return this;
    }

    public HelpSupport helpAccountCheck() {
        helpAcc.click();
        helpPageTitle.shouldHave(Condition.text("Что делать, если аккаунт Steam был похищен?"));
        return this;
    }

    public HelpSupport helpSupportCheck() {
        helpGuard.click();
        helpPageTitle.shouldHave(Condition.text("Что делать, если письмо с кодом Steam Guard не пришло, но Steam его запрашивает?"));
        return this;
    }

    public HelpSupport helpMobileAuthCheck() {
        helpMobAuth.click();
        helpPageTitle.shouldHave(Condition.text("Мой мобильный аутентификатор Steam был удален или утерян"));
        return this;
    }

    public HelpSupport helpMainPageSelect() {
        mainSupport.click();
        return this;
    }

    public HelpSupport helpSuppSelect() {
        helpSupp.click();
        return this;
    }
}
