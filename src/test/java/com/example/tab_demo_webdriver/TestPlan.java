package com.example.tab_demo_webdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        ProjectPage projectPage = new ProjectPage(driver);
        driver.get(Utils.BASE_URL + "/#/workbooks/151/views");
        System.out.println(driver.getTitle());
        projectPage.assertPageTitle();



    }
   @Test
    public void workbookPage () {
        driver.get(Utils.BASE_URL + "/#/views/EnterpriseSuccessDashboardLIVE_0/SciFinderDB?:iid=1");
        //driver.navigate().to(Utils.BASE_URL + "/#/views/EnterpriseSuccessDashboardLIVE_0/SciFinderDB?:iid=1");
      // WorkbookPage workbookPage = new WorkbookPage(driver);
       driver.switchTo().frame("")


    }

    @AfterAll
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
