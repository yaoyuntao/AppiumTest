package test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SearchUser extends AppiumTestBase  {
    @Test
   public void searchuser() {
       androidDriver.findElement(By.id("tv_search")).click();
       androidDriver.findElement(By.id("et_contact_search")).sendKeys("10478100");
       androidDriver.findElement(By.id("rcv_search_result")).click();
       androidDriver.findElement(By.id("tv_msg")).click();
       for(int i = 0; i < 2; i++) {
           androidDriver.findElement(By.id("et_msg")).sendKeys("this is a msg from appium"+i);
           androidDriver.findElement(By.id("tv_send_msg")).click();
       }

        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[5]/android.widget.ImageView")).click();
        androidDriver.findElement(By.id("et_hongbao_amount")).sendKeys("0.01");
        androidDriver.findElement(By.id("et_hongbao_remark")).sendKeys("Appium 发红包了！赶紧领旨谢恩，即便是0.01火车头！");
        androidDriver.findElement(By.id("tv_push_money")).click();
        androidDriver.findElement(By.id("pv_pwd")).sendKeys("147258");




    }
}
