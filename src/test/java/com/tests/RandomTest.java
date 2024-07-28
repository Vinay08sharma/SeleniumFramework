package com.tests;

import com.demo.annotations.FrameworkAnnotations;
import com.demo.driver.DriverManager;
import com.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomTest extends BaseTest{

    @FrameworkAnnotations
    @Test
    public static void randomTest (){
        LoginPage loginPage = new LoginPage();
        loginPage.login("asdasd", "asdasdae");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");
    }
}
