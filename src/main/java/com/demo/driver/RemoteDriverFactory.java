package com.demo.driver;

import com.demo.config.ConfigFactory;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory {
    private RemoteDriverFactory (){}

    public static WebDriver getRemoteDriver(String browserName) throws MalformedURLException {
        WebDriver driver = null;
        DesiredCapabilities cap = new DesiredCapabilities();
        if (browserName.equalsIgnoreCase("chrome")) {
            cap.setBrowserName("chrome");
        } else if (browserName.equalsIgnoreCase("safari")) {
            cap.setBrowserName("safari");
        }
        System.out.println("current url" + ConfigFactory.getConfig().remoteUrl());
        return new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteUrl()), cap);
    }
}
