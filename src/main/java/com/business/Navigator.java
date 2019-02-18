package com.business;

import com.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigator {

    AndroidDriver androidDriver = DriverManager.getInstance().getAndroidDriver();

    public void GoDialogue(){

        androidDriver.findElement(By.id("iv_navi_chats")).click();

    }

    public void GoContacts(){

        androidDriver.findElement(By.id("iv_navi_contacts")).click();

    }

    public void GoFinds(){

        androidDriver.findElement(By.id("iv_navi_finds")).click();

    }

    public void GoMy(){

        androidDriver.findElement(By.id("iv_navi_me")).click();

    }


}
