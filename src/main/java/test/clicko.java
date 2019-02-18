package test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class clicko extends AppiumTestBase {

    @Test
    public void click1()throws Exception{
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
    }

    @Test
    public void click2() throws Exception{

        androidDriver.findElement(By.id("iv_navi_finds")).click();

        androidDriver.findElement(By.id("iv_navi_me")).click();
    }

}

