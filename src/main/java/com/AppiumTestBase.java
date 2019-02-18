package com;

import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;

import java.net.URL;

public class AppiumTestBase {

    protected static AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    @BeforeClass
    public static void setup(){

    }



    @AfterClass
    public static void tearDown(){
        if (androidDriver != null) {
            androidDriver.quit();
        }
        System.out.println("@After:tearDown;测试结束");
    }
}
