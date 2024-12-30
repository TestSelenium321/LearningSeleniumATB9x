package com.BalaMYKA.ex_seleniumbasis04_Locator;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium01 {

    @Description("To verify that with invalid email and password, error is shown in app.vwo.com ")
    @Test

    public void Negative_test_VWO_Login() throws Exception {
        //or
        //ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions. addArguments("--start-maximized");

        //EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions. addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

       // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username" data-qa="hocewoqisi">

        WebElement emailtextbox = driver.findElement(By.id("login-username"));
        emailtextbox.sendKeys("admin@admin.com");

        //<input
        // type="password"
        // class="text-input W(100%)" name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

        WebElement emailpassword = driver.findElement(By.id("login-password"));
        emailpassword.sendKeys("admin");

         //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)" data-qa="sibequkica">
        //	<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //	<span data-qa="ezazsuguuy">Sign in</span>
        //	</button>

        WebElement SigninButton = driver.findElement(By.id("js-login-btn"));
        SigninButton.click();


        Thread.sleep(6000);

        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));

       Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.close();
    }
}
