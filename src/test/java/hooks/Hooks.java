package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.But;
import io.cucumber.java.mk_latn.No;
import org.apiguardian.api.API;
import utils.DriverFactory;
import utils.ConfigReader;
import utils.ScreenshotHelper;

import javax.swing.text.html.HTML;

public class Hooks {

  @Before
  public void setup() {
    System.out.println("----- Test Started -----");
    DriverFactory.getDriver().get(ConfigReader.getProperty("baseUrl"));
  }

  @After
  public void teardown(Scenario scenario) {
    System.out.println("----- Test Finished -----");
    if (scenario.isFailed()) {
      byte[] screenshot = ScreenshotHelper.takeScreenshot(DriverFactory.getDriver());
      scenario.attach(screenshot, "image/png", "Failure Screenshot");
      System.out.println("Screenshot captured for failed scenario: " + scenario.getName());
    }
    DriverFactory.quitDriver();
  }
}

/*
BYTE Purpose

▶ Attach image inside Cucumber HTML report

Why bytes?
A byte is the smallest unit of data in computers
byte[] = array of bytes
Represents raw image data (pixels + encoding)

Cucumber reports can only embed images when passed as byte[]
➡ Because the report renders it directly from memory
➡ No file creation required

📍 Works in Jenkins / GitHub Actions where file system may not be accessible
📍 This is why Cucumber API is designed to accept byte[] only

FILE Purpose

▶ Store screenshot physically in folder for debugging

Why File?
Easy to save on disk
You can manually open and review screenshots later

📍 But… Cucumber cannot embed File directly in HTML report
➡ You would need to convert File → byte[] again

⭐ Best Practice

📌 Use byte[] in Hooks for reporting
📌 Use File method only if you want a saved copy too
 */