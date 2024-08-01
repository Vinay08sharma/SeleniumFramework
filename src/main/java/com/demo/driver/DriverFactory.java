package com.demo.driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class DriverFactory {

    public static WebDriver getDriver(String browserName, String runMode) throws MalformedURLException {
        WebDriver driver = null;
        if (runMode.equalsIgnoreCase("local")) {
            driver = LocalDriverFactory.getLocalDriver(browserName);
        } else if (runMode.equalsIgnoreCase("remote")) {
            driver = RemoteDriverFactory.getRemoteDriver(browserName);
        }
        return driver;
    }
}
