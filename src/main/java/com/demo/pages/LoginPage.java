package com.demo.pages;

import com.demo.enums.WaitType;
import com.demo.reports.ExtentLogger;
import com.demo.reports.ExtentManager;
import com.demo.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class LoginPage {

    /*
     Using private modifies since, the variables will only be used within this class
     final - Since the values will always remain constants
     static - Since only once it gets loaded & can be accessed by 100 threads & data should remain unchanged,
      so memory management would be better
    */

    private static final By TXT_BOX_USERNAME = By.name("username");
    private static final By TXT_BOX_PASSWORD = By.name("password");
    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");


    //Made below methods to private since don't want others to use this, use directly login Method
    private LoginPage setUserName(String username) {
        SeleniumUtils.sendKeys(TXT_BOX_USERNAME,username);
        ExtentLogger.info("User name entered successfully");
        return this;
    }

    private LoginPage setPassword(String password) {
        SeleniumUtils.sendKeys(TXT_BOX_PASSWORD,password);
        ExtentLogger.info("User name password successfully");
        return this;
    }

    private HomePage clickLoginButton() {
        SeleniumUtils.click(BTN_LOGIN, WaitType.PRESENCE);
        ExtentLogger.info("Tapped on login button");
        return new HomePage(); // Page chaining
    }

    public HomePage login(String username, String password) {
        return setUserName(username)
                .setPassword(password)
                .clickLoginButton();
    }

}
