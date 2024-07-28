package com.demo.utils;

import com.demo.driver.DriverManager;
import com.demo.enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.demo.config.ConfigFactory.getConfig;

public class SeleniumUtils {

    public static void click(By by, WaitType waitStrategy) {
       WebElement element = null;
       if(waitStrategy.equals(WaitType.PRESENCE)) {
           element = waitUntilElementPresent(by);
       } else if (waitStrategy.equals(WaitType.CLICKABLE)) {
           element = waitUntilElementtoBeClickable(by);
       } else {
           element.click();
       }
    }

    public static void sendKeys(By by, String value){
        waitUntilElementPresent(by).sendKeys(value); // since explicit wait will return webelement
//        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    public static String getText(By by) {
        return waitUntilElementPresent(by).getText();
    }

    private static WebElement waitUntilElementPresent(By by) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementtoBeClickable(By by) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(by));
    }
}
