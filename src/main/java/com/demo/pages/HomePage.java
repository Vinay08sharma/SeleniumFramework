package com.demo.pages;

import com.aventstack.extentreports.Status;
import com.demo.driver.DriverManager;
import com.demo.pages.pageComponents.FooterMenuComponent;
import com.demo.pages.pageComponents.TopMenuComponent;
import com.demo.reports.ExtentLogger;
import com.demo.reports.ExtentManager;

public class HomePage {

//    HomePage as TopMenuComponent --> this relationship is called as composition

    private final TopMenuComponent topMenuComponent;
    private final FooterMenuComponent footerMenuComponent;
    public HomePage (){
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    };

    public String getHomePageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnLinkAdmin(){
        topMenuComponent.clickLinkAdmin();
    }

    public void getFooterMenuText() {
        footerMenuComponent.getFooterText();
    }
}
