package com.cases.DEV;

import com.DriverManager;
import com.business.*;
import com.utils.PressOnce;
import com.utils.Swipe;
import com.utils.Wait;
import io.appium.java_client.android.AndroidDriver;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
/*
* 适用于oppo
*
* */
//按照用例名顺序执行,强行指定用例执行顺序
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutoRegression {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
        new Wait().WaitSecond(3);
        welcome.ChoseEvn();
        new Wait().WaitSecond(6);
        welcome.StartToUse();
    }

    @Test
    public void test_02_userLogin() throws Exception{

        LightLogin lightLogin = new LightLogin();
        lightLogin.enterUserPhone("13810272000");
        lightLogin.enterVerifyCode("123456");
        lightLogin.ClickTologin();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test_03_userRecommend() throws Exception{

        UserRecommend userRecommend = new UserRecommend();
        userRecommend.Ignore();

    }

    @Test
    public void test_04_creategroup() throws Exception{
        new Swipe().SwipeP2P(500,1500,500,1000);
        new DialogueExpand().ClickExpand();
        CreateGroup createGroup = new CreateGroup();
        createGroup.ClickCreateGroup();
        createGroup.EnterGroupName("groupA");
        createGroup.SubmmitCreate();
        createGroup.inviteCancle();
    }

    @Test
    public void test_05_createSubGroup() throws Exception{
//        点击方式打开群信息
        new PressOnce().Click(1000,120);
        new Wait().WaitSecond(3);
        new Swipe().SwipeP2P(500,1500,500,1000);
        new PressOnce().Click(200,740);
        CreateGroup createGroup = new CreateGroup();
//        点击方式打开创建子群
//        createGroup.CreateSubGroup();
        createGroup.EnterGroupName("GroupAsub");
        createGroup.SubmmitCreate();
        createGroup.inviteCancle();
        createGroup.Back();

    }

}
