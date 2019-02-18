package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateGroup {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();


    public void ClickCreateGroup(){

        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")).click();

    }

    public void EnterGroupName(String name){

        WebElement wl = androidDriver.findElement(By.id("met_group_name"));
        wl.sendKeys(name);

    }

    public void SubmmitCreate(){

        androidDriver.findElement(By.id("btn_create_group")).click();
    }

    public void inviteHuochat(){
        androidDriver.findElement(By.id("ll_hx")).click();
    }

    public void inviteWechat(){
        androidDriver.findElement(By.id("ll_wx")).click();
    }

    public void inviteCancle(){
        androidDriver.findElement(By.id("rl_close")).click();
    }

    public void OpenGroupInfo(){
//        androidDriver.findElement(By.id("iv_user_icon")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
    }


    public void CreateSubGroup(){
//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]")).click();
        androidDriver.findElement(By.linkText("创建子群")).click();
        androidDriver.findElement(By.id("")).click();
    }

    public void CreateGroupCode(){
        androidDriver.findElement(By.id("ll_group_passcode")).click();
    }

    public void ShareGroupLink(){
        androidDriver.findElement(By.id("ll_group_surl")).click();
    }

    public void ShareGroup2DCode(){
        androidDriver.findElement(By.id("ll_group_qrcode")).click();
    }

    public void EditGroupInfo(){
        androidDriver.findElement(By.id("iv_right_icon")).click();
    }

//    rl_back     iv_left_btn     rl_right    iv_avatar
    public void Back(){
        androidDriver.findElement(By.id("iv_left_btn")).click();
    }



}
