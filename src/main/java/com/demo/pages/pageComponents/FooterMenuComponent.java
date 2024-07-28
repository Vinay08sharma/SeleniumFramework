package com.demo.pages.pageComponents;

import com.demo.driver.DriverManager;
import com.demo.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private static final By FOOTER_TXT = By.cssSelector("p.orangehrm-copyright:nth-child(1)");

    public String getFooterText() {
        return SeleniumUtils.getText(FOOTER_TXT);
    }
}
