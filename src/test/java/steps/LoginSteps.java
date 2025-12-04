package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

  WebDriver driver;

  @Then("Page title should be displayed")
  public void pageTitleShouldBeDisplayed() {
    Assert.assertTrue(driver.getTitle().contains("Google"));
    System.out.println("Title: " + driver.getTitle());
    driver.quit();
  }

  @Given("I open Google")
  public void iOpenGoogle() {
    driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();

  }
}
