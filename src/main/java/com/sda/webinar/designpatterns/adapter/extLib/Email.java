package com.sda.webinar.designpatterns.adapter.extLib;

public class Email {

    public boolean connect() {
        return true;
    }

    public boolean authorize(String login, String password) {
        return true;
    }

    public boolean sendMessage(String message) {
        return true;
    }

    public boolean disconnect() {
        return true;
    }

}
