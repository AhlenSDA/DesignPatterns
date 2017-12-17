package com.sda.webinar.designpatterns.observer;

public class SmsObserver implements Observer {

    public void notifyObserver() {
        System.out.println("SMS notification");
    }
}
