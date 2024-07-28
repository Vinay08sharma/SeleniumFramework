package com.demo.testData;

import com.creditdatamw.zerocell.annotation.Column;
import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/SeleniumTestData.xlsx")
public class Testdata {

    @Column(name = "TestCaseName", index = 0)
    public String TestCaseName;

    @Column(name = "UserName", index = 1)
    public String UserName;

    @Column(name = "Password", index = 2)
    public String Password;

    @Column(name = "ExpectedTitle", index = 3)
    public String ExpectedTitle;
}
