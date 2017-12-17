package com.sda.webinar.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notifyObserver();
        }
    }
}
