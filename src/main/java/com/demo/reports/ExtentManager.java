package com.demo.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager (){}

    private final static ThreadLocal<ExtentTest> testThreadLocal = new ThreadLocal<>();

    static ExtentTest getExtentTest() {
        System.out.println("Driver thread = " + testThreadLocal.get());
        return testThreadLocal.get();
    }

    static void setExtentTest(ExtentTest ExtentTest) {
        testThreadLocal.set(ExtentTest);
    }
}
