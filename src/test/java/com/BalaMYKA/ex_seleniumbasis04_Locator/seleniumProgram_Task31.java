package com.BalaMYKA.ex_seleniumbasis04_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumProgram_Task31 {

    @Description("To verify the error message in 360url")
    @Test

    public void Test_message_360() throws Exception {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123456");

        Thread.sleep(5000);

        WebElement signin = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signin.click();

        Thread.sleep(15000);

        //WebElement errormessge = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
        WebElement errormessage = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(errormessage.getText(), "Your free trial has expired");

        driver.close();
        driver.quit();


    }
}
