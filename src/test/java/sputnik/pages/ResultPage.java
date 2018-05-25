package sputnik.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ResultPage extends PageObject {

    @FindBy(css = "div.b-result-list.js-result-list")
    WebElementFacade elementResults;

    public boolean resultAreDisplayed() {

        elementResults.waitUntilVisible();
        return elementResults.isDisplayed();
    }

}
