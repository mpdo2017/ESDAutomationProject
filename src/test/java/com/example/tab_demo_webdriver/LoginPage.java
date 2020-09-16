package com.example.tab_demo_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageObject {

    WebElement username = driver.findElement(By.xpath("//div/div/div/div[2]/span/form/div[1]/div[1]/div/div/input"));
    WebElement password = driver.findElement(By.xpath("//div/div/div/div[2]/span/form/div[1]/div[2]/div/div/input"));
    WebElement signIn_submit_btn = driver.findElement(By.xpath("//div/div/div/div[2]/span/form/button"));
    String actualPageTitle = "Tableau Server";

    public LoginPage(WebDriver driver) {
        super(driver);

        String expectedPageTitle = driver.getTitle();
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println("Verification Successful! Correct title is displayed.");
        }
        System.out.println("Verification Unsuccessful. Incorrect page title displayed.");
    }

    /** Login as valid user
     * @param
     * @username
     * @password
     */

    /**
     * public ProjectPage loginValidUser () {
     * this.username.sendKeys("mll25");
     * this.password.sendKeys("BobRoss1125!");
     * this.signIn_submit_btn.click();
     * return new ProjectPage(driver);
     * }
     */


    public void enterUserName() { this.username.sendKeys("mll25");}

    public void enterPassword() { this.password.sendKeys("BobRoss1125!"); }

    public void pressSubmitBtn() { this.signIn_submit_btn.click(); }
}
