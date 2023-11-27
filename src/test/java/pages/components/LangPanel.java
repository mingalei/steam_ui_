package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LangPanel {
    SelenideElement
            langPanel = $("#language_pulldown"),
            langRu = $x("//a[contains(@class,'tight') and text()='Русский (Russian)']");

    public LangPanel languagePanel() {
                langPanel.click();
        return this;
    }

    public LangPanel langChangeRu() {
                langRu.click();
        return this;
    }


}
