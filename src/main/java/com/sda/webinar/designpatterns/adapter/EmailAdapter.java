package com.sda.webinar.designpatterns.adapter;

import com.sda.webinar.designpatterns.adapter.extLib.Email;

import java.util.Date;

// ADAPTER

public class EmailAdapter implements ReserveTable {

    Email email = new Email();
    String login = "login";
    String password = "password";

    public EmailAdapter() {
    }

    public EmailAdapter(String s, String login, String password) {
    }

    public boolean reserve(String person, Date date, int numberOfPeople) {
        email.connect();
        email.authorize(login, password);
        email.sendMessage(person + " at " + date.toString() + " for " + numberOfPeople);
        email.disconnect();
        return true;

    }
}
