package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

  private WebDriver driver;

  @FindBy(name = "q")
  private WebElement searchBox;

  public GoogleHomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void openGoogle() {
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
  }

  public void searchText(String text) {
    searchBox.sendKeys(text);
    searchBox.sendKeys(Keys.ENTER);
  }

  public String getPageTitle() {
    return driver.getTitle();
  }
}
