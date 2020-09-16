package com.example.tab_demo_webdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    public static WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void testPlan () {

        System.setProperty("webdriver.chrome.drive", Utils.CHROME_DRIVER_LOCATION);
        driver.get(Utils.BASE_URL);
        driver.manage().getCookies();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @Test
    public void loginPageForm () {

        LoginPageForm loginPageForm = new LoginPageForm(driver);
        loginPageForm.enterUserName();
        loginPageForm.enterPassword();
        loginPageForm.pressSubmitBtn();

    }

    @AfterAll
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
