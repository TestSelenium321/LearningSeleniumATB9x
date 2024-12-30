package com.BalaMYKA.ex_seleniumbasis04_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium03 {

    @Description ("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test

    public void Test_checkbox() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial");
        driver.manage().window().maximize();

        WebElement email_Login = driver.findElement(By.id("page-v1-step1-email"));
        email_Login.sendKeys("987656789dasdasd");

        WebElement Checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        Checkbox.click();

        List<WebElement> button_click = driver.findElements(By.tagName("button"));
        button_click.get(0).click();

                //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit button--disabled-primary"
        // data-qa="page-su-submit"
        // value="" _msttexthash="546754" _msthash="20" disabled="disabled">
        // Create a Free Trial Account
        // </button>

        Thread.sleep(5000);

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        driver.close();


    }

}
