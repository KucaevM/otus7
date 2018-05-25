package sputnik.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sputnik.pages.ResultPage;
import sputnik.pages.SearchPage;

import static org.junit.Assert.assertTrue;

public class SearchScenarioSteps {

    SearchPage searchPage;
    ResultPage resultPage;

    @Given("user opens the site")
    public void user_opens_the_site(){ searchPage.open();
   }

    @When("^user search for '(.*)'$")
    public void user_search_for(String text){
         searchPage.InputToSearchField(text);
    }


    @Then("^user see table result$")
    public void user_see_table_result(){  assertTrue(resultPage.resultAreDisplayed());
    }


}
