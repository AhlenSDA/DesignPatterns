package com.sda.webinar.designpatterns.observer;

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        publisher.addObserver(new SmsObserver());
        publisher.addObserver(new SmsObserver());
        publisher.addObserver(new SmsObserver());
        publisher.addObserver(new SmsObserver());
        publisher.addObserver(new SmsObserver());
        publisher.addObserver(new SmsObserver());

        publisher.addObserver(new EmailObserver());
        publisher.addObserver(new EmailObserver());
        publisher.addObserver(new EmailObserver());

        publisher.notifyObservers();

    }
}
