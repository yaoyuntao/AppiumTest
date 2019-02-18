package com.cases;

import com.DriverManager;
import com.business.*;
import com.utils.PressOnce;
import com.utils.Swipe;
import com.utils.Wait;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SendMessages {

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
//            图形验证码
//            passLogin.EnterVerifycode();
//            passLogin.ClickVerify();
//            new Wait().WaitSecond(5);
//          跳过位置权限问询，登录之后马上处理
            new PermissionAllow().ClickAllowLocation();
            new Wait().WaitSecond(8);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            滑动激活
            new PressOnce().Click(500,220);
//            搜索好友
//            androidDriver.findElement(By.id("tv_search")).click();
            androidDriver.findElement(By.id("et_contact_search")).sendKeys("10209878");
//            androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout")).sendKeys("10189375");
//            命中的结果
            androidDriver.findElement(By.id("tv_search_hint")).click();
//            new Wait().WaitSecond(5);
//            iv_user_icon/tv_common_name
            androidDriver.findElement(By.id("tv_common_name")).click();
//            androidDriver.findElement(By.id("tv_common_name")).click();
            androidDriver.findElement(By.id("tv_msg")).click();
//            允许文件访问
            new PermissionAllow().ClickAllowFiles();
//            new Wait().WaitSecond(5);
//            new PressOnce().Click(800,1900);


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
