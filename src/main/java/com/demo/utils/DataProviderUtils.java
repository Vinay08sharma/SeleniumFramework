package com.demo.utils;

import com.demo.testData.Testdata;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

public class DataProviderUtils {
    @DataSupplier(runInParallel = true)
    public StreamEx<Testdata> getData(){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(Testdata.class)
                .withSource("SeleniumTestData.xlsx")
                .read()
                .filter(testdata -> testdata.TestCaseName.equalsIgnoreCase("LoginTest"));

    }
}
