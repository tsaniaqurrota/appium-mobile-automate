package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static AndroidDriver<MobileElement> driver;
    String baseUrl = "http://127.0.0.1:4723/";

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "10DE4K0LS00042K");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("appPackage", "com.chickin.chickinapps");
        capabilities.setCapability("appActivity", "com.chickin.chickinapps.presentation.splash.SplashActivity");
        capabilities.setCapability("automationName", "UiAutomator2");

        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        URL url = new URL(baseUrl);
        driver = new AndroidDriver<>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }
}
