package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;


import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    AndroidDriver<MobileElement> driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    HomePage homePage;

    public LoginStepDefs(){
        this.driver = Hooks.getDriver();
        this.dashboardPage = new DashboardPage(driver);
        this.homePage = new HomePage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is on chickin page")
    public void userIsOnChickinLoginPage() {
        dashboardPage.isMainLogoChickinDisplayed();
        assertTrue("Kelola kandang dan keuangan peternakan lebih mudah dengan aplikasi Chickin", dashboardPage.isMottoChickinDisplayed());
        dashboardPage.clickLoginButton();
        assertTrue("Login", loginPage.isTittleLoginDisplayed());
    }

    @When("User inputs valid credentials")
    public void userInputsValidCredentials() {
        loginPage.inputCredential("tsaniaqurrota","password123");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User logins successfully")
    public void userLoginsSuccessfully() {
        assertTrue(homePage.isAtHomePage());
    }
}
