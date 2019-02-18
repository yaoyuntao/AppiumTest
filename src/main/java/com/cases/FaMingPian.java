package com.cases;

import com.business.LightLogin;
import com.business.SearchUser;
import com.business.Welcome;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.AppiumTestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//按照用例名顺序执行,强行指定用例执行顺序
@FixMethodOrder(MethodSorters.DEFAULT)
public class FaMingPian extends AppiumTestBase  {



    @Test
    public void test_01_welcome() throws Exception{

        Welcome welcome = new Welcome();
        welcome.ChoseEvn();
//        welcome.StartToUse(androidDriver);
    }
//
//    @Test
//    public void test_02_userLogin() throws Exception{
//
//        Properties properties = new Properties();
//        // 使用ClassLoader加载properties配置文件生成对应的输入流
//        FileInputStream ufis;
//        {
//            try {
//                ufis = new FileInputStream("./src/main/resources/user.properties");
//                // 使用properties对象加载输入流
//                properties.load(ufis);
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        LightLogin lightLogin = new LightLogin();
////        lightLogin.enterUserPhone(androidDriver,properties.getProperty("user_phone"));
////        lightLogin.enterVerifyCode(androidDriver,properties.getProperty("verify_code"));
////        lightLogin.ClickTologin(androidDriver);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Test
//    public void test_03_searchuser() throws Exception{
//
//        SearchUser searchUser = new SearchUser();
////        searchUser.ClickSearch();
////        searchUser.InputUserID(androidDriver);
////        searchUser.ClickSearch();
//    }
//


}
