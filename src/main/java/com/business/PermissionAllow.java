package com.business;

import com.DriverManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;


public class PermissionAllow {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

//    允许位置共享
    public void ClickAllowLocation(){

        TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(700,1200)).release().perform();

    }

//    拒绝位置共享
    public void ClickDenyLocation(){

        TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(700,1200)).release().perform();

    }

//    允许访问照片、媒体内容、文件
    public void ClickAllowFiles(){

        TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(750,1200)).release().perform();

    }

//    拒绝访问照片、媒体内容、文件
    public void ClickDenyFiles(){

        TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(550,1250)).release().perform();

    }

//    允许访问联系人信息
    public void ClickAllowContacts(){

    TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
    touchAction.press(PointOption.point(750,1350)).release().perform();

}


//    拒绝访问联系人信息
    public void ClickDenyContacts(){

    TouchAction touchAction = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(0L);
    touchAction.press(PointOption.point(550,1350)).release().perform();

}

}
