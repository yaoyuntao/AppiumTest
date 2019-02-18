package com.tommy.utils;

import io.appium.java_client.android.AndroidDriver;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.tommy.java.TestDemo.adbDeviceName;

public class TommyTestUtils {


    /**
     * 找到控件并且点击
     * @param driver
     * @param idName
     */
    public static void findAndClick(AndroidDriver driver, String idName) {
        try {
            driver.findElement(By.id(idName)).click();
        }catch (Exception e){
            Log.getLog().debug("查找id失败"+ idName,1);
        }

    }


    /**
     * 延时等待 单位秒
     * @param driver
     * @param s
     */
    public static void delay(AndroidDriver driver, int s) {
        driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
    }

    /**
     * 根据时间等待控件出现
     * @param driver
     * @param id
     * @param waitTime
     */
    public static boolean waitForVisible(AndroidDriver driver, String id, int waitTime) {
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                driver.findElement(By.id(id));
                return true;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
        }
        return false;
    }

    /**
     * 是否发现控件id
     * @param driver
     * @param by
     * @return
     */
    public static boolean isIdShow(AndroidDriver driver, final By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 快速发送 文本 [这里用到了测试线程中的设备号]
     * @param str
     */
    public static void sendKeys(String str) {
        try {
            Runtime.getRuntime().exec("adb -s "+ adbDeviceName +" shell input text " + str);
        }catch (Exception e){

        }
    }
}
