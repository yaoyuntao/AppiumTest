package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LightLogin {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    Properties properties = new Properties();
    // 使用ClassLoader加载properties配置文件生成对应的输入流
    FileInputStream efis;
    {
        try {
            efis = new FileInputStream("./src/main/resources/element.properties");
            // 使用properties对象加载输入流
            properties.load(efis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void enterUserPhone(String userPhone){

        WebElement wl = androidDriver.findElement(By.id("et_phone"));
        wl.sendKeys(userPhone);

    }

    public void enterVerifyCode(String verifycode){

        androidDriver.findElement(By.id("et_code")).sendKeys(verifycode);

    }

    public void ClickTologin(){

        androidDriver.findElement(By.id("tv_login")).click();

    }



}
