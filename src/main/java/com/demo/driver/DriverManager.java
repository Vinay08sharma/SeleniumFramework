package com.demo.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager (){};

    private final static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        System.out.println("Driver thread = " + tdriver.get());
        return tdriver.get();
    }

    public static void setDriver(WebDriver driver) {
        tdriver.set(driver);
    }


}
