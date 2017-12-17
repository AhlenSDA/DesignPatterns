package com.sda.webinar.designpatterns.singleton;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance() {

        // synchronized check prevents from more that one thread using our instance

        if (instance == null) {
            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("Hell World");
    }
}