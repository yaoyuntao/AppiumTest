package com.cases;

import com.DriverManager;
import com.business.PassLogin;
import com.business.PermissionAllow;
import com.business.Welcome;
import com.utils.PressOnce;
import com.utils.Wait;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SendMessagesSample {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
//        生产环境注释掉
//        welcome.ChoseEvn();
//        new Wait().WaitSecond(5);
        welcome.StartToUse();
//        new Wait().WaitSecond(4);

        String[] users = {
                "13231657315"};
        for(String user : users){
            System.out.println("当前用户："+user);
//            登录
            PassLogin passLogin = new PassLogin();
            passLogin.enterUserPhone(user);
            passLogin.EnterPassword("Huobi888");
            passLogin.ClickTologin();
//
            new Wait().WaitSecond(30);


//            循环发消息

            for(int i = 0; i<100000; i++){

//                搜索好友
//                androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\n")).sendKeys("This msg is from ippium "+i);
                androidDriver.findElement(By.id("et_msg")).sendKeys("This is a message from appium "+i);
                androidDriver.findElement(By.id("tv_send_msg")).click();

            }



        }


    }


}
