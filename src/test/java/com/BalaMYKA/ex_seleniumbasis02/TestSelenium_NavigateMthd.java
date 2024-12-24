package com.BalaMYKA.ex_seleniumbasis02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_NavigateMthd {

  @Description ("To verify Navigate Methods")
    @Test

    public void testselenium () throws Exception{

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.co.in/");
      driver.manage().window().maximize();

        Thread.sleep(5000);
        //to validate Navigate function

        driver.navigate().to("https://bing.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        driver.quit();

           }

}
