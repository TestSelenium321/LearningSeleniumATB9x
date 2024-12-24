package com.BalaMYKA.ex_seleniumbasis02;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("OPen the VWO.com url and get the page tittle")
    @Test

    public void testselenium() throws Exception {

        //open the url
        //Get the page tittle

        // If you are using selenium 3.14
        // You need to setup the Driver(browser)

        //edge
        // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
//        // Firefox
//        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//        // Chrome
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        // IE
//        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
//        // Safari
//        System.setProperty("webdriver.safari.driver", "path/to/safaridriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

    }
}
