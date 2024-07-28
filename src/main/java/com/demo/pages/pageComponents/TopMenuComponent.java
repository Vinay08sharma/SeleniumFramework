package com.demo.pages.pageComponents;

import com.demo.driver.DriverManager;
import com.demo.enums.WaitType;
import com.demo.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class TopMenuComponent {

    By linkAdmin = By.xpath("//span[text()='Admin']");

    public void clickLinkAdmin() {
        SeleniumUtils.click(linkAdmin, WaitType.PRESENCE);
    }
}
