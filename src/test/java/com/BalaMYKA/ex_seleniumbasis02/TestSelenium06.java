package com.BalaMYKA.ex_seleniumbasis02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06 {

    @Description ("OPen the google url and perform some function")
    @Test
    public void testselenium () throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().minimize();
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();
    }

}
