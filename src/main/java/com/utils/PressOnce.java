package com.utils;

import com.DriverManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;


public class PressOnce {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

/*
* 单击坐标(int hight, int width)
*
* */
    public void Click(int hight, int width){

        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(hight,width)).release().perform();

    }
}


////这里使用driveManager的对象