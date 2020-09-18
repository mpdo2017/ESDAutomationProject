package com.example.tab_demo_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProjectPage extends PageObject {
            WebElement viewsHover = driver.findElement
                    (By.cssSelector("[data-tb-test-id=\"content-card-select-hover\"]"));
            WebElement openViews = driver.findElement
                    (By.cssSelector("[data-tb-test-id=\"workbook-151-card\"]"));

    public ProjectPage(WebDriver driver) {
        super(driver);

    }
    public void assertPageTitle() {
        String pageTitle = "Enterprise Success Dashboard LIVE: Views - Tableau Server";
        String expectPageTitle = driver.getTitle();
        if (expectPageTitle.equals(pageTitle)) {
            System.out.println("Correct page title displayed.");
        } else {
            System.out.println(" Incorrect page title displayed.");
        }
    }
    public void accessView () {

    }


}




