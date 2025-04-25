package LoginFunAutomationSuite;

import org.openqa.selenium.WebDriver;

public abstract class BaseTest implements BrowserActions {
    protected WebDriver driver;

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}