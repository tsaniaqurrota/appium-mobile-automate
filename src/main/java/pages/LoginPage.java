package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chickin.chickinapps:id/imageView")
    private MobileElement welcomeLoginPage;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/tvAppBarTitle")
    private MobileElement tittleLogin;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/tvLocation")
    private MobileElement logoChickinHome;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/etUsername")
    private MobileElement fieldUsername;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/etPassword")
    private MobileElement fieldPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.chickin.chickinapps:id/btnLogin\")")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/ok")
    private MobileElement btnOk;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Daftar Sekarang\")")
    private MobileElement signUpNow;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/tvForgotPassword")
    private MobileElement forgotPassword;

    @AndroidFindBy(id = "com.chickin.chickinapps:id/tvToPhoneNumberLogin")
    private MobileElement phoneNumberLogin;


    public void inputCredential(String username, String password) {
        fieldUsername.click();
        fieldUsername.sendKeys(username);
        fieldPassword.click();
        fieldPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

    public void clickSignUpText() {
        signUpNow.click();
    }

    public boolean isTittleLoginDisplayed() {
        return welcomeLoginPage.isDisplayed();
    }



}
