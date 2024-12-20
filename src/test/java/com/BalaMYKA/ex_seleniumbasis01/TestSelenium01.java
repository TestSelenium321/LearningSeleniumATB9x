package com.BalaMYKA.ex_seleniumbasis01;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open the app.vwo.com and get the tille")
    @Test
    public void test_seleniumO1(){

        //Open a URL
        //Print the title

        FirefoxDriver driver = new FirefoxDriver();
        driver.get ("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    }
}
