package com.demo.config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/configs/config.properties")
public interface FrameworkConfig extends Config {

    long implicitWaitTimeout();

    String url();

    String browser();

    long timeOut();

    String runMode();

    String remoteUrl();
}
