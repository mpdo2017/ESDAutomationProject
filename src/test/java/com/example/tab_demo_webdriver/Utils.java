package com.example.tab_demo_webdriver;
// Configuration class for automation project; contains classes and locators

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Utils {

    //defines a URL path
    public static String BASE_URL = "https://casanalyticsp01.cas.org/";

    //defines a path to a chromedriver
    public static String CHROME_DRIVER_LOCATION = "chromedriver";

    //Defines a method for screenshots of test failures
    public static void captureScreenshot(WebDriver driver, String screenshotName){

        try
        {
            TakesScreenshot screenshot=(TakesScreenshot)driver;

            File source=screenshot.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));

            System.out.println("Screenshot taken");
        }
        catch (Exception e)
        {

            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
    }


}
