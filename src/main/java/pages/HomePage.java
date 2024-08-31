package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chickin.chickinapps:id/tvLocation")
    private MobileElement logoChickinHome;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.chickin.chickinapps:id/navigation_bar_item_icon_view\").instance(0)")
    private MobileElement homeIcon;

    public boolean isAtHomePage() {
        try {
            return logoChickinHome.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
