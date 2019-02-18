package first;


import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.findElement(By.id("digit_5")).click();
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("del")).click();
        driver.findElement(By.id("op_add")).click();
        driver.findElement(By.id("digit_6")).click();
        driver.findElement(By.id("eq")).click();

        Thread.sleep(2000);

        String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        System.out.println(result);

        driver.quit();
    }

}