package com.cases;

import com.DriverManager;
import com.business.*;
import com.utils.PressOnce;
import com.utils.Swipe;
import com.utils.Wait;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;

public class UserBatchgainred {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
//        生产环境注释掉
//        welcome.ChoseEvn();
        new Wait().WaitSecond(5);
        welcome.StartToUse();
        new Wait().WaitSecond(4);

//            登录
            PassLogin passLogin = new PassLogin();
            passLogin.enterUserPhone("17310271029");
            passLogin.EnterPassword("Huobi888");
            passLogin.ClickTologin();
            new Wait().WaitSecond(20);
//            跳过位置权限问询，登录之后马上处理
//            new PermissionAllow().ClickAllowLocation();
//            new Swipe().SwipeP2P(500,1500,500,1000);

            PressOnce pressOnce = new PressOnce();
            for(int i = 1;i<10000;i++){
                new Wait().WaitSecond(1);
                pressOnce.Click(500,1600);
                new Wait().WaitSecond(4);
                pressOnce.Click(80,120);
            }


        }


    }


