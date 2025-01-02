package com.BalaMYKA.ex_seleniumbasis03_Options;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OptionsLocator2 {

    @Description("Selenium Options")
    @Test

    public void testselenium () throws Exception {

        // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions

        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--headless");
        chromeoptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://google.com");

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        // edgeOptions.addArguments("--window-size=1280,720");
        // edgeOptions.addArguments("--window-size=800,600");
        // edgeOptions.addArguments("--incognito");
        // edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex04_Selenium_Options_Locators/adblocker.crx"));



    }
}