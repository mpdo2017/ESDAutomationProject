package com.example.tab_demo_webdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        driver.navigate().to(Utils.BASE_URL + "/#/projects/26");

    }
    @Test
    public void projectPage () {
        ProjectPage projectPage = new ProjectPage(driver);
        //driver.navigate().to(Utils.BASE_URL + "/#/workbooks/151/views");
        new WebDriverWait(driver,30).until
                (ExpectedConditions.visibilityOf(projectPage.viewsHover));
        Actions actions = new Actions(driver);
        actions.moveToElement(projectPage.openViews).click().perform();
        projectPage.assertPageTitle();

    }
    @Test
     public void workbookPage () {
        WorkbookPage workbookPage = new WorkbookPage(driver);
        new WebDriverWait(driver,30).until
                (ExpectedConditions.visibilityOf(workbookPage.scifinderHover));
        Actions actions = new Actions(driver);
        actions.moveToElement(workbookPage.scifinderHover).click().perform();
   }

    @AfterAll
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
