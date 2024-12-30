package com.BalaMYKA.ex_seleniumbasis04_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04_Task {

    @Description("Verify the url is displayed as expected after loginto katlon")
    @Test

    public void Test_url_verification() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Button_click = driver.findElement(By.id("btn-make-appointment"));
        Button_click.click();

        WebElement user_name = driver.findElement(By.id("txt-username"));
        user_name.sendKeys("John Doe");

        WebElement Login_password = driver.findElement(By.id("txt-password"));
        Login_password.sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);

        WebElement Login_Button_Click = driver.findElement(By.id("btn-login"));
        Login_Button_Click.click();

        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");


    }
}
