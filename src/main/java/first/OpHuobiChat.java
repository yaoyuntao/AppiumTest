package first;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class OpHuobiChat {

    private AndroidDriver androidDriver;

    @Before
    public void setup() throws Exception{
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
    }

    @Test
    public void login(){

        System.out.println("@Test:开始");

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
//        androidDriver.findElement(By.id("tv_right_text")).click();
//        tv_right_text
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();

        androidDriver.currentActivity();
//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
//        androidDriver.findElement(By.className("android.widget.ImageView")).click();
//        TouchAction action = new TouchAction(androidDriver);
//        Duration duration = Duration.ofMillis(5000);    //按压5秒
//        action.press(400,500).waitAction(duration).moveTo(50,500).release().perform();


//        TouchAction perform = touchAction.press(PointOption.point(400,500)).moveTo(PointOption.point(400,700));
//        为了 激活界面，对页面进行了一次滑动
        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(400,1500)).moveTo(PointOption.point(400, 1000)).release().perform();
//        touchAction.press(PointOption.point(400,1500)).release().perform();
//        touchAction.press(PointOption.point(400,1500)).waitAction(WaitOptions.waitOptions(duration)).moveTo(PointOption.point(400, 1000)).release().perform();
//        System.out.println("22222222");
//      点击"+"号
//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView")).click();

        androidDriver.findElement(By.id("iv_navi_finds")).click();

        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();

        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
        androidDriver.findElement(By.id("iv_navi_finds")).click();
        androidDriver.findElement(By.id("iv_navi_me")).click();
//
//        androidDriver.findElement(By.id("iv_navi_finds")).click();


//        androidDriver.pressKey();

//        androidDriver.findElement(By.id("tv_search")).click();

//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout")).click();

//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout")).sendKeys("10478076");

//
//        androidDriver.findElement(By.id("tv_common_name")).click();

//        androidDriver.findElement(By.id("tv_msg")).click();

//        androidDriver.findElement(By.id("et_msg")).sendKeys("This msg is from ippium");

//        androidDriver.findElement(By.id("tv_send_msg")).click();
//        androidDriver.findElement(By.id("ll_pic")).click();

//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.CheckBox")).click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        tv_common_name  tv_msg tv_send_msg

//        androidDriver.findElement(By.id("equal")).click();
//        String result = androidDriver.findElement(By.id("com.android.bbkcalculator:id/edit_result_text")).getText();
////        System.out.println(result);
//        assertEquals("11a", result);

    }



    @After
    public  void tearDown(){
        if (androidDriver != null) {
            androidDriver.quit();
        }
        System.out.println("@After:tearDown;测试结束");
    }


}
