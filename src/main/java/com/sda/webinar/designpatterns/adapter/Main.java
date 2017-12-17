package com.sda.webinar.designpatterns.adapter;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ReserveTable reserveTableViaEmail = new EmailAdapter("czosnek@wp.pl", "login", "password");
        reserveTableViaEmail.reserve("Janek", new Date(2017, 12, 13, 21, 30), 6);

        ReserveTable reserveTableViaSms = new SmsAdapter();
        reserveTableViaSms.reserve("Janek", new Date(2017, 12, 13, 21, 30), 6);

    }
}
