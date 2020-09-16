package com.example.tab_demo_webdriver;


import org.openqa.selenium.WebDriver;


public class ProjectPage extends PageObject {

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

}




