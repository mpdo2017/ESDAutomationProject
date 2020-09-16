package com.example.tab_demo_webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {
  WebDriver driver = new ChromeDriver();

  @Test
  public void openPage() {
    driver.get(Utils.BASE_URL);
    driver.manage().window().maximize();
  }
}