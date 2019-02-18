package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchUser {
    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    public void ClickSearch(){
        androidDriver.findElement(By.id("tv_search")).click();
    }

    public void InputUserID(){

        androidDriver.findElement(By.id("et_contact_search")).sendKeys("10478100");

    }
    public void ChooseUser(){

        androidDriver.findElement(By.id("tv_common_name")).click();

    }

}
