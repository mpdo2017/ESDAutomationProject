package com.example.tab_demo_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends PageObject {
    WebElement esdPage = driver.findElement(By.xpath("//div[1]/div/div/div[1]/div/div/div/span/div/div[2]/div/div[2]/div[1]/div/div[1]/section/div[8]/div/div/div/div[1]/div/div/a"));

    public ProjectPage(WebDriver driver){
        super(driver);

    }
    public void goToEsdPage (){ this.esdPage.click(); }
}
