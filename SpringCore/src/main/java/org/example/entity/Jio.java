package org.example.entity;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling Using Jio sim");
    }

    @Override
    public void datause() {

        System.out.println("Data Using Jio Service");
    }
}
