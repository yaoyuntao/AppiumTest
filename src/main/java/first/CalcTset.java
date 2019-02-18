package first;

import io.appium.java_client.android.AndroidDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class CalcTset {

    private AndroidDriver androidDriver;

    @Before
    public void setup() throws Exception{
        System.out.println("@Before：创建对设备的链接...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("appPackage", "com.android.bbkcalculator");
        capabilities.setCapability("appActivity", ".Calculator");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("@Before：链接已经创建...");
    }

    @Test
    public void calcAdd(){
        System.out.println("@Test:开始");
        androidDriver.findElement(By.id("digit5")).click();
        androidDriver.findElement(By.id("digit5")).click();
        androidDriver.findElement(By.id("digit9")).click();
        androidDriver.findElement(By.id("clear1")).click();
        androidDriver.findElement(By.id("plus")).click();
        androidDriver.findElement(By.id("digit6")).click();
//        KeyEvent keyEvent = new KeyEvent();
//        androidDriver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_1));
//        androidDriver.pressKey(new KeyEvent(AndroidKey.KEY_11));
//        androidDriver.pressKey(keyEvent.withKey(AndroidKey.DIGIT_3));
//        KeyEvent keyEvent = new KeyEvent();
//        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        androidDriver.pressKey(keyEvent.withKey(AndroidKey.A));

        androidDriver.findElement(By.id("equal")).click();
        String result = androidDriver.findElement(By.id("com.android.bbkcalculator:id/edit_result_text")).getText();
//        System.out.println(result);
        assertEquals("11", result);
    }

    @Test
    public void calcMinus(){
        androidDriver.findElement(By.id("digit9")).click();
        androidDriver.findElement(By.id("digit1")).click();
        androidDriver.findElement(By.id("minus")).click();
        androidDriver.findElement(By.id("digit1")).click();
        androidDriver.findElement(By.id("digit9")).click();
        androidDriver.findElement(By.id("equal")).click();
        String result = androidDriver.findElement(By.id("com.android.bbkcalculator:id/edit_result_text")).getText();
//        System.out.println(result);
        assertEquals("72", result);

    }

    @Test
    public void calcMul(){
        androidDriver.findElement(By.id("digit9")).click();
        androidDriver.findElement(By.id("digit1")).click();
        androidDriver.findElement(By.id("mul")).click();
        androidDriver.findElement(By.id("digit1")).click();
        androidDriver.findElement(By.id("digit9")).click();
        androidDriver.findElement(By.id("equal")).click();
        String result = androidDriver.findElement(By.id("com.android.bbkcalculator:id/edit_result_text")).getText();
//        System.out.println(result);
        assertEquals("1729", result);

    }

    @After
    public  void tearDown(){
        if (androidDriver != null) {
            androidDriver.quit();
        }
        System.out.println("@After:tearDown;测试结束");
    }

}
