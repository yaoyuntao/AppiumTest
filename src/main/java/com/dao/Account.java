package com.dao;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Account {

    public static Account instance;
    public static Account getInstance(){
        if(instance == null){
            instance = new Account();
        }
        return instance;
    }



}
