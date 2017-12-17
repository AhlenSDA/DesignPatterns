package com.sda.webinar.designpatterns.adapter.extLib;

public class Sms {

    public boolean checkLine() {
        return true;
    }

    public boolean sendSms(String message, String number, String smsGateway) {
        return true;
    }
}
