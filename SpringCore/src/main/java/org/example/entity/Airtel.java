package org.example.entity;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling Using Airtel Sim");
    }

    @Override
    public void datause() {

        System.out.println("Data Using Airtel Service");
    }
}
