package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
    public DashboardPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Image\"]")
    private MobileElement mainLogoChickin;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Kelola kandang dan keuangan peternakan lebih mudah dengan aplikasi Chickin\")")
    private MobileElement mottoChickin;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/btnToLogin")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/btnToSignUp")
    private MobileElement btnSignUp;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/laySwipeUp")
    private MobileElement btnEksplore;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Chickin blog\"]")
    private MobileElement chickinBlogTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.chickin.chickinapps:id/title\" and @text=\"Faktor yang Mempengaruhi Harga DO Ayam Broiler Hari Ini\"]")
    private MobileElement chickinBlog;



    public void clickLoginButton() {
        btnLogin.click();
    }

    public void clickSignUpButton() {
        btnSignUp.click();
    }

    public void clickExploreButton() {
        btnEksplore.click();
    }

    public boolean isMottoChickinDisplayed() {
        return mottoChickin.isDisplayed();
    }

    public boolean isMainLogoChickinDisplayed() {
        return mainLogoChickin.isDisplayed();
    }

    public boolean isLogoChickinDisplayed() {
        return mainLogoChickin.isDisplayed();
    }

    public boolean isChickinBlogDisplayed() {
        return chickinBlogTitle.isDisplayed();
    }
    public void selectChickinBlog(){
        chickinBlog.click();
    }


}
