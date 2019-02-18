package com.cases;

import com.AppiumTestBase;
import com.business.*;
import com.utils.PressOnce;
import com.utils.Swipe;
import com.utils.Wait;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


//按照用例名顺序执行,强行指定用例执行顺序
@FixMethodOrder(MethodSorters.DEFAULT)
public class GroupJoin extends AppiumTestBase  {

    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
//        生产环境注释掉
//        welcome.ChoseEvn();
        new Wait().WaitSecond(5);
        welcome.StartToUse();
    }

    @Test
    public void test_02_userLogin() throws Exception{

        PassLogin passLogin = new PassLogin();
        passLogin.enterUserPhone("17090078072");
        passLogin.EnterPassword("Huobi888");
        passLogin.ClickTologin();
        passLogin.EnterVerifycode();
        passLogin.ClickVerify();

       new Wait().WaitSecond(5);
//          跳过位置权限问询
        new PermissionAllow().ClickAllowLocation();
    }


    @Test
    public void test_03_joingroup() throws Exception{

        new PressOnce().Click(1000,120);

        JoinGroup joinGroup = new JoinGroup();
        joinGroup.ClickJoinGroupByCode();
        joinGroup.EnterCode("1779");
        new PermissionAllow().ClickAllowLocation();
        new Wait().WaitSecond(10);
    }



}
