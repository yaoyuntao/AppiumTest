//package first;
//
//import io.appium.java_client.AppiumDriver;
//
//
//import io.appium.java_client.MobileElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.DeviceRotation;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.concurrent.TimeUnit;
//
//public class apptest1 {
//    public static void main(String[] args) throws MalformedURLException {
//        WebDriver wd;
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appium-version", "1.0");
//        capabilities.setCapability("platformName", "iOS");
//        capabilities.setCapability("platformVersion", "9.3");
//        capabilities.setCapability("deviceName", "iPhone 6s Plus");
//        capabilities.setCapability("app", "/Users/gloria/jobs/appiumtest/sample-code/sample-code/apps/TestApp/build/release-iphonesimulator/TestApp.app");
//        wd = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
//            public void rotate(DeviceRotation deviceRotation) {
//
//            }
//
//            public DeviceRotation rotation() {
//                return null;
//            }
//
//            public MobileElement scrollTo(String s) {
//                return null;
//            }
//
//            public MobileElement scrollToExact(String s) {
//                return null;
//            }
//        };
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        wd.findElement(By.name("TextField1")).sendKeys("4");
//        wd.findElement(By.name("(null)")).sendKeys("5");
//        wd.switchTo().alert().accept();
//        wd.findElement(By.name("show alert")).click();
//        wd.findElement(By.name("(null)")).click();
//        wd.findElement(By.name("ComputeSumButton")).click();
//        wd.findElement(By.name("locationStatus")).click();
//        // wd.shake();
////            wd.findElement(By.name("DisabledButton")).click();
////            (JavascriptExecutor)wd.executeScript("mobile: swipe", new HashMap<String, Double>() {{
////                put("touchCount", (double) 1); put("startX", (double) 125);
////                put("startY", (double) 389); put("endX", (double) 283);
////                put("endY", 390); put("duration", 1.3539453125); }});
//        wd.findElement(By.name("show alert")).click();
//        wd.findElement(By.name("contact alert")).click();
//        wd.close();
//    }
//
//
//}
