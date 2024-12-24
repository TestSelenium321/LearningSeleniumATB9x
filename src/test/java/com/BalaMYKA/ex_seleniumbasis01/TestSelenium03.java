package com.BalaMYKA.ex_seleniumbasis01;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium03 {

    @Description("Open the app.vwo.com url in chrome and get the page tittle")
    @Test

    public void test_selenium(){

        //OPen the chrome url
        //Get the page tittle

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

    }
}
