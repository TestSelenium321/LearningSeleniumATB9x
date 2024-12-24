package com.BalaMYKA.ex_seleniumbasis01;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description ("Open the app.vwo.com url and get the tittle")
    @Test

    public void test_selenium(){

        //Open the EdgeDriver url
        //Get the tittle of the page

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

    }
}
