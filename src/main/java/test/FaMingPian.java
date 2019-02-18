package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class FaMingPian extends AppiumTestBase  {
    @Test
    public void FaMingPin() {
        TouchAction touchAction = new TouchAction(androidDriver);
        Duration duration = Duration.ofMillis(0L);
        touchAction.press(PointOption.point(400, 1500)).moveTo(PointOption.point(400, 1000)).release().perform();

//        点击搜索框
        touchAction.press(PointOption.point(800, 260)).release().perform();
//        输入搜索内容
        androidDriver.findElement(By.id("et_contact_search")).sendKeys("10478100");
//        点击搜索结果
        androidDriver.findElement(By.id("rcv_search_result")).click();
//        点击发送消息按钮
        androidDriver.findElement(By.id("tv_msg")).click();

        androidDriver.findElement(By.id("iv_more")).click();
//        点击名片按钮
        touchAction.press(PointOption.point(920, 1800)).release().perform();
//        点击搜索框
        touchAction.press(PointOption.point(500, 240)).release().perform();
//        输入用户名搜索
        androidDriver.findElement(By.id("et_contact_search")).sendKeys("yyt001");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        选择搜索结果，即可发送
        androidDriver.findElement(By.id("rl_base")).click();


    }
}
