package com.example.tab_demo_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends PageObject {
    WebElement esdPage = driver.findElement(By.cssSelector("div#project-26-card"));
    WebElement esdWorkbook = driver.findElement(By.cssSelector("div#workbook-151-card"));

    public ProjectPage(WebDriver driver){
        super(driver);
    }
    public void goToEsdPage (){ this.esdPage.click();}

    public void openEsdWorkbook (){this.esdWorkbook.click();}
}
