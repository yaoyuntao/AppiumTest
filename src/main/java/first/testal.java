package first;

import io.appium.java_client.android.AndroidDriver;
import test.FaMingPian;

import test.casea;

public class testal {
    static AndroidDriver androidDriver;

    public static void main(String args[]){
//        FaMingPian faMingPian =new FaMingPian();
//        faMingPian.FaMingPin();

        casea ca = new casea();
        ca.FabiBaoQing(androidDriver);
    }
}
