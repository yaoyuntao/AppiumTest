package com.utils;

import com.DriverManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


//暂时有错，不能执行操作
public class Swipe {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

//    从点(x,y)开始滑动到点(m,n)
    public void SwipeP2P (int x, int y, int m, int n){

        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.press(PointOption.point(x,y)).moveTo(PointOption.point(m, n)).release().perform();

    }

}

