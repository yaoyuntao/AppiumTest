package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Welcome {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    public void ChoseEvn(){

        androidDriver.findElement(By.id("tv_cancel")).click();

    }

    public void StartToUse(){

        androidDriver.findElement(By.id("tv_start_use")).click();

    }
}
