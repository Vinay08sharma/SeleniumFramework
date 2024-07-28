package com.demo.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demo.constants.FrameworkConstant;

public final class ExtentReport {

    private ExtentReport (){};

    public static ExtentReports extentReports;
    public static ExtentTest extentTest; // not threadSafe

    public static void initReports(){
        extentReports = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(FrameworkConstant.getReportPath());
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentReports.attachReporter(extentSparkReporter);
    }

    public static void flushReports() {
        extentReports.flush();
    }

    public static void createTest(String testCaseName){
        extentTest = extentReports.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }
    public static void assignAuthor (String authorName){ ExtentManager.getExtentTest().assignAuthor(authorName);}
}
