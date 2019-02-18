package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class casea {


    public void FaHangQing(AndroidDriver androidDriver) {

        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(401, 1500)).moveTo(PointOption.point(400, 1000)).release().perform();

//        点击搜索框
        touchAction.press(PointOption.point(800, 260)).release().perform();
//        输入搜索内容
        androidDriver.findElement(By.id("et_contact_search")).sendKeys("10478100");
//        点击搜索结果
        androidDriver.findElement(By.id("rcv_search_result")).click();
//        点击发送消息按钮
        androidDriver.findElement(By.id("tv_msg")).click();
        //进入行情页面，发行情
        //发行情按钮
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        //点击HT按钮
//        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView")).click();

        touchAction.press(PointOption.point(350, 1400)).release().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击返回上一页

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void FabiBaoQing(AndroidDriver androidDriver) {

        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
//        touchAction.press(PointOption.point(400, 1500)).moveTo(PointOption.point(400, 1000)).release().perform();
//        打开表情包
        androidDriver.findElement(By.id("ll_bq")).click();
//        点击表情坐标
        touchAction.press(PointOption.point(421, 1560)).release().perform();
//        发送
        androidDriver.findElement(By.id("tv_send_msg")).click();


    }

    public void ZhuanZhang(AndroidDriver androidDriver){

        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
//        touchAction.press(PointOption.point(400, 1500)).moveTo(PointOption.point(400, 1000)).release().perform();
//        打开语音短信
        androidDriver.findElement(By.id("iv_more")).click();
//        长按说话
        touchAction.press(PointOption.point(405, 1419)).release().perform();
        androidDriver.findElement(By.id("et_money")).sendKeys("0.01");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        发送
        androidDriver.findElement(By.id("tv_submit")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        androidDriver.findElement(By.id("pv_pwd")).sendKeys("147258");
//        androidDriver.pressKey(AndroidKey.DIGIT_1);//这个报错要学会
//        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FaMingPian faMingPian = new FaMingPian();



    }

}
