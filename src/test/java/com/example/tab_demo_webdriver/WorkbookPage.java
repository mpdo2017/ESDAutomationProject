package com.example.tab_demo_webdriver;

import com.example.tab_demo_webdriver.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkbookPage extends PageObject {
    WebElement scifinderHover = driver.findElement
            (By.cssSelector("[data-tb-test-id=\"content-card-select-hover\"]"));
    WebElement scifinderWkSheet = driver.findElement
            (By.cssSelector("[data-tb-test-id=\"view-692-card\"]"));

    public WorkbookPage (WebDriver driver) {
        super(driver);

    }
    public void openWorkbook() {
        this.scifinderWkSheet.click();

    }
}
