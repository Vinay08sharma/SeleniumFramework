package com.demo.driver;

import com.demo.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static com.demo.config.ConfigFactory.getConfig;

public class Driver {

    public static void initDriver() throws MalformedURLException {
        String runMode = getConfig().runMode();
        if (DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(getConfig().browser(), runMode);
            DriverManager.setDriver(driver);
        }

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(
                getConfig().implicitWaitTimeout(), TimeUnit.SECONDS);
        DriverManager.getDriver().get(getConfig().url());
    }

    public static void quitDriver() {
        if(DriverManager.getDriver()!= null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
