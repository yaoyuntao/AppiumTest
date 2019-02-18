package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class AppiumTestBase {

    static AndroidDriver androidDriver;

    @BeforeClass
    public static void setup() throws Exception{
        System.out.println("@Before：创建对设备的链接...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("appPackage", "com.huochat.im");
        capabilities.setCapability("appActivity", ".activity.SplashActivity");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("@Before：链接已经创建...");
        androidDriver.findElement(By.id("tv_cancel")).click();

        androidDriver.findElement(By.id("tv_start_use")).click();
        androidDriver.findElement(By.id("et_phone")).sendKeys("13810272000");
        androidDriver.findElement(By.id("et_code")).sendKeys("123456");
        androidDriver.findElement(By.id("tv_login")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @AfterClass
    public static void tearDown(){
        if (androidDriver != null) {
            androidDriver.quit();
        }
        System.out.println("@After:tearDown;测试结束");
    }


}
