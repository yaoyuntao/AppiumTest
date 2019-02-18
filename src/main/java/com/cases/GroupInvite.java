package com.cases;

import com.business.CreateGroup;
import com.business.PassLogin;
import com.business.PermissionAllow;
import com.business.Welcome;
import com.utils.PressOnce;
import com.utils.Wait;
import org.junit.Test;

public class GroupInvite {

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
//          跳过位置权限问询，登录之后马上处理
        new PermissionAllow().ClickAllowLocation();
    }



    @Test
    public void test_02_groupInvite() throws Exception{

        new PressOnce().Click(1000,120);

        CreateGroup createGroup = new CreateGroup();

        createGroup.ClickCreateGroup();
        createGroup.EnterGroupName("Huochat");
        createGroup.SubmmitCreate();
    }

}
