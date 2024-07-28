package com.tests;

import com.demo.annotations.FrameworkAnnotations;
import com.demo.pages.LoginPage;
import com.demo.testData.Testdata;
import com.demo.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    @FrameworkAnnotations
    @Test(description = "Verify if user is able to login to orangehrm", dataProvider = "getData",
            dataProviderClass = DataProviderUtils.class)
    public void LoginTest(Testdata testdata) {
        LoginPage loginPage = new LoginPage();

        String homePageTitle = loginPage.login(testdata.UserName, testdata.Password).getHomePageTitle();
        Assert.assertEquals(homePageTitle, testdata.ExpectedTitle,
                "Expected the title to be 'OrangeHRM' but found " + homePageTitle);
    }
}
