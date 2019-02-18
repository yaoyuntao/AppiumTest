package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/*
* 跳过推荐好友和群
* */
public class UserRecommend {
    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    public void Ignore(){
//        androidDriver.findElement(By.linkText("跳过")).click();
        androidDriver.findElement(By.id("tv_right_text")).click();
    }

    public void Accept(){
        androidDriver.findElement(By.linkText("马上加入")).click();
        androidDriver.findElement(By.id("btn_confirm")).click();
    }

    public void Another(){
        androidDriver.findElement(By.linkText("换一批")).click();
        androidDriver.findElement(By.id("tv_group_change")).click();
    }


}
