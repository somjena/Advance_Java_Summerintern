package org.example.entity;

public class Airtel implements Sim{
    private int id;
    private String name;
    private String usd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    @Override
    public void calling() {
        System.out.println("Calling Using Airtel Sim");
    }

    @Override
    public void datause() {

        System.out.println("Data Using Airtel Service");
    }
}
