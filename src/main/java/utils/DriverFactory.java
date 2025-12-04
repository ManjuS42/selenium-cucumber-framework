package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      String browser = ConfigReader.getProperty("browser").toLowerCase();

      switch (browser) {
        case "chrome":
          driver = new ChromeDriver();
          break;
        case "firefox":
          driver = new FirefoxDriver();
          break;
        default:
          throw new RuntimeException("Browser not supported: " + browser);
      }
    }
    return driver;
  }

  public static void quitDriver() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }
}
