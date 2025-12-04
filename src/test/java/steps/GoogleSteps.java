package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.GoogleHomePage;
import pages.GoogleResultsPage;
import utils.DriverFactory;

public class GoogleSteps {

  GoogleHomePage homePage = new GoogleHomePage(DriverFactory.getDriver());
  GoogleResultsPage resultsPage = new GoogleResultsPage(DriverFactory.getDriver());

  @Given("User opens Google")
  public void open_google() {
    homePage.openGoogle();
  }

  @Then("Google title should be displayed")
  public void verify_title() {
    Assert.assertTrue(homePage.getPageTitle().contains("Google"));
  }

  @When("User searches for {string}")
  public void user_searches_for(String text) {
    homePage.searchText(text);
  }

  @Then("Search results should be displayed")
  public void search_results_should_be_displayed() {
    Assert.assertTrue(resultsPage.resultsDisplayed());
  }

}
