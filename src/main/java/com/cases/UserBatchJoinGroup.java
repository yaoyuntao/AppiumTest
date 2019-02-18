package com.cases;

import com.DriverManager;
import com.business.*;
import com.utils.PressOnce;
import com.utils.Wait;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;

public class UserBatchJoinGroup {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
//        生产环境注释掉
//        welcome.ChoseEvn();
        new Wait().WaitSecond(5);
        welcome.StartToUse();
        new Wait().WaitSecond(4);

        String[] users = {
                "16637051955",
                "18600121700",
                "18210475196",
                "15901243921",
                "18511746186",
                "13342058020",
                "15811247727",
                "13522913739",
                "18611340922",
                "13269019298",
                "15010254640",
                "15632144812",
                "15811154148",
                "17734328025",
                "18511480860",
                "18810265020",
                "18201467853",
                "13240998349",
                "15866093617",
                "17326871400",
                "18701021012",
                "17611626963",
                "17610639626",
                "13581716318",
                "17090078072",
                "13141369996"
                };
        for(String user : users){
            System.out.println("当前用户："+user);
//            登录
            PassLogin passLogin = new PassLogin();
            passLogin.enterUserPhone(user);
            passLogin.EnterPassword("Huobi888");
            passLogin.ClickTologin();
            passLogin.EnterVerifycode();
            passLogin.ClickVerify();
            new Wait().WaitSecond(5);
//          跳过位置权限问询，登录之后马上处理
            new PermissionAllow().ClickAllowLocation();

//            加群
            new PressOnce().Click(1000,120);
            JoinGroup joinGroup = new JoinGroup();
            joinGroup.ClickJoinGroupByCode();
            joinGroup.EnterCode("1778");
            new Wait().WaitSecond(6);
            System.out.println("当前用户："+user+" 加群完成");

            new PermissionAllow().ClickAllowFiles();



//            返回会话列表；按照位置点击左上角（）
            new Wait().WaitSecond(2);
            new PressOnce().Click(65,120);




            new Wait().WaitSecond(3);

//            退出火信；先进入我的，再退出登录
            new Navigator().GoMy();
            androidDriver.findElement(By.id("ll_me_exit")).click();
            androidDriver.findElement(By.id("tv_confirm")).click();


        }


    }


}
