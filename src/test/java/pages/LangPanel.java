package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class LangPanel {
    SelenideElement
            langPanel = $("#language_pulldown"),
            langRu = $x(".//a[contains(@class,'tight') and text()='Русский (Russian)']");

    public  LangPanel languagePanel() {
        step("", () ->
                langPanel.click());
        return this;
    }

    public  LangPanel langChangeRu() {
        step("", () ->
                langRu.click());
        return this;
    }


}