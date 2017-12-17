package com.sda.webinar.designpatterns.observer;

public class EmailObserver implements Observer {

    public void notifyObserver() {
        System.out.println("Email notification");
    }
}
