package com.BalaMYKA.ex_seleniumbasis02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description ("OPen the VWO.com url and get the page tittle")
    @Test

    public void testselenium (){

        //open url
        //get the page tittle


        // Webdriver hierarchy

        // SearchContext(I) -> (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)

        // SearchContext - Interface - findElement, and findElements - GGF (great grand father)
        // WebDriver - Interface     - some incomplete functions - GF (grand father)
        // RemoteWebDriver - Class   - It also has some functions - F (Father)
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver - Class - S (son)

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver = new ChromeDriver();
        // ChromeDriver  driver = new ChromeDriver();

        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver(); ~1%
        //driver = new FirefoxDriver(); - Not possible

        // 2  Do you want to run on Chrome then change to Edge to Firefox ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver(); // 97% -
        driver = new FirefoxDriver(); // 97% -

        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

    }
}
