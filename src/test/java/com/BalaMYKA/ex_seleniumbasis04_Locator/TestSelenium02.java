package com.BalaMYKA.ex_seleniumbasis04_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test

    public void login_Test() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement Emailaddress_Login = driver.findElement(By.id("login-username"));
        Emailaddress_Login.sendKeys("admin@admin.com");

        WebElement Emailaddress_Password = driver.findElement(By.id("login-password"));
        Emailaddress_Password.sendKeys("admin");


        WebElement Signin_Button = driver.findElement(By.id("js-login-btn"));
        Signin_Button.click();
        Thread.sleep(6000);

        WebElement error_message = driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(5000);

        //LinkText

       // WebElement LinkText = driver.findElement(By.linkText("Start a free trial"));
       // LinkText.click();

        Thread.sleep(5000);

        //PartialLinkText

       WebElement Partial_LinkText = driver.findElement(By.partialLinkText("Start"));
       Partial_LinkText.click();

        driver.close();

    }

}
