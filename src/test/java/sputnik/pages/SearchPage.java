package sputnik.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.sputnik.ru")
public class SearchPage extends PageObject {

    @FindBy(name="q")
    WebElementFacade searchInput;

    @FindBy(css = "[value='Найти']")
    WebElementFacade searchButton;

    public void InputToSearchField(String text){
        searchInput.type(text);
        searchButton.click();
    }

   }
