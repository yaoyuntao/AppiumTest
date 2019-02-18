package com.utils;

public class Wait {

    public void WaitSecond(int n){

        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
