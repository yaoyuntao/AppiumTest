package com;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static DriverManager instance = null;

    private AndroidDriver androidDriver = null;

    public static DriverManager getInstance(){
        if(instance==null)
        {
            instance = new DriverManager();
        }
        return instance;
    }

    private DriverManager(){

        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./src/main/resources/device.properties");
            // 使用properties对象加载输入流
            properties.load(fis);
            System.out.println(properties.getProperty("device_name"));
            System.out.println("@Before：创建对设备的链接...");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", properties.getProperty("device_name"));
            capabilities.setCapability("automationName", properties.getProperty("cap_automationName"));
            capabilities.setCapability("platformName", properties.getProperty("cap_platformName"));
            capabilities.setCapability("platformVersion", properties.getProperty("device_version"));
            capabilities.setCapability("appPackage", properties.getProperty("app_package"));
            capabilities.setCapability("appActivity", properties.getProperty("app_activity"));
            androidDriver = new AndroidDriver(new URL(properties.getProperty("appium_protocol")), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("@Before：链接已经创建...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public AndroidDriver getAndroidDriver(){
        return androidDriver;
    }
}



//这里定义一个对象，声明之后所有的类和方法都用这个，怎么定义，怎么使用？
//DriverManager.init(driver);  DriverManager.initWebWait(webwait);      这个是用来干嘛的？
