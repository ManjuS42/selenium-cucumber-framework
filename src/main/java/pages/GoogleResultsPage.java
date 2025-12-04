package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage {

  private WebDriver driver;

  @FindBy(id = "search")
  private WebElement searchResultsSection;

  public GoogleResultsPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public boolean resultsDisplayed() {
    return searchResultsSection.isDisplayed();
  }
}
