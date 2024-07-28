package com.demo.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.demo.utils.ScreenshotUtils;

public final class ExtentLogger {
    private ExtentLogger (){}

    public static void pass (String Message){
        ExtentManager.getExtentTest().pass(Message,
                MediaEntityBuilder
                        .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail (String Message){
        ExtentManager.getExtentTest().fail(Message,
                MediaEntityBuilder
                        .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void info (String Message){
        ExtentManager.getExtentTest().info(Message,
                MediaEntityBuilder
                        .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }


}
