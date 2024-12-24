package com.BalaMYKA.ex_seleniumbasis02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Assert {

    @Description("OPen the url and get the text in the source code and compare")
    @Test
    public void testselenium() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Page title is visible as expected!");
            Assert.assertTrue(true);
        } else {
            throw new Exception("Page title is NOT visible as expected!");

        }

        Thread.sleep(5000);
        driver.close();

    }
}
