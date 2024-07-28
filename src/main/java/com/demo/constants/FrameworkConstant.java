package com.demo.constants;

import java.text.SimpleDateFormat;

public final class FrameworkConstant {
    private FrameworkConstant (){};

    private static final String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
            .format(new java.util.Date());
    private static final String REPORT_PATH = System.getProperty("user.dir")
            + "/reports/report_"+timeStamp+".html";

    public static String getReportPath(){
        return REPORT_PATH;
    }


}
