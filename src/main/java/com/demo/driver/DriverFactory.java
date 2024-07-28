package com.demo.driver;

import com.demo.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

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
