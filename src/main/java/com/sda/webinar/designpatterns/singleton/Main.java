package com.sda.webinar.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton.getInstance().print();

        // creating few instance of Singleton to see if only one will be created
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // values after @ should be the same which means we are using always the same object
        System.out.println("Singleton 1: " + s1);
        System.out.println("Singleton 2: " + s2);
        System.out.println("Singleton 3: " + s3);

        // com.sda.webinar.designpatterns.singleton.Singleton@4554617c
    }
}