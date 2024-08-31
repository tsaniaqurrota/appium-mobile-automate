package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AppiumDriver<MobileElement> driver;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void click(MobileElement element) {
        element.click();
    }

    public void sendKeys(MobileElement element, String text) {
        element.sendKeys(text);
    }

    public String getText(MobileElement element) {
        return element.getText();
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }
}