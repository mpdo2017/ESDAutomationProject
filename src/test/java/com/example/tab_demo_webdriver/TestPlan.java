package com.example.tab_demo_webdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
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
    public void loginPage () {
        /**Creates object for login page*/
        LoginPage loginPage = new LoginPage(driver);
        /**Logs in Standard User*/
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.pressSubmitBtn();

    }
    @Test
    public void projectPage () {
        /**Creates object for project page */
        ProjectPage projectPage = new ProjectPage(driver);
        projectPage.goToEsdPage();
        projectPage.openEsdWorkbook();
    }

    @AfterAll
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
