package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JoinGroup {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();


    public void ClickJoinGroupByCode(){

        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();

    }

    public void EnterCode(String code){

        WebElement wl = androidDriver.findElement(By.id("pv_pwd"));
        wl.sendKeys(code);

    }


}
