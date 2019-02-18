package com.tommy.java;


import com.tommy.utils.TommyTestUtils;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;

public class TestDemo {

    public static String adbDeviceName;   //设备号

    private AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        System.out.println("创建对设备的链接...");

        File classpathRoot = new File(System.getProperty("user.dir"));


        Properties properties = new Properties();
        //当前类
        InputStream inputStream = TestDemo.class.getResourceAsStream("/src/com/tommy/resources/test.properties");
        properties.load(inputStream);
        String address = properties.getProperty("test.apk.address");
        String apkName = properties.getProperty("test.apk.name");
        String deviceName = properties.getProperty("test.device.name");
        String version = properties.getProperty("test.device.version");
        String packge = properties.getProperty("test.apk.package");
        String startActivity = properties.getProperty("test.apk.start");
        String protocol = properties.getProperty("test.appium.protocol");
        adbDeviceName = properties.getProperty("test.device.adbname");

        File appDir = new File(classpathRoot, address);

        File app = new File(appDir, apkName);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", version);
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", packge);
        capabilities.setCapability("appActivity", startActivity);

//        System.setProperty("webdriver.http.factory", "apache");

        driver = new AndroidDriver<>(new URL(protocol), capabilities);

        System.out.println("链接成功...");
    }

    @Test
    public void testWeChat() {
        boolean result;
        result = TommyTestUtils.waitForVisible(driver, "com.tencent.mm:id/d74", 60);  //60s的循环判断

        if (result) {
            TommyTestUtils.findAndClick(driver, "com.tencent.mm:id/d74");  //点击注册

//            TommyTestUtils.delay(driver,6);  //可以等待 也可以 判断

            result = TommyTestUtils.waitForVisible(driver, "com.tencent.mm:id/ht", 10);  //10s判断

            if (result) {
                System.out.println("开始注册...");

                TommyTestUtils.delay(driver, 2);
                List<WebElement> elements = driver.findElements(By.id("com.tencent.mm:id/hz"));
                elements.get(0).clear();
                elements.get(0).sendKeys("Tommy");
                elements.get(1).clear();
                elements.get(1).sendKeys("13788888888");
                elements.get(2).clear();
                elements.get(2).sendKeys("123456");

                TommyTestUtils.findAndClick(driver, "com.tencent.mm:id/czh");  //点击注册
            }
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("结束");
    }
}
