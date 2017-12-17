package com.sda.webinar.designpatterns.adapter;

import com.sda.webinar.designpatterns.adapter.extLib.Sms;

import java.util.Date;

public class SmsAdapter implements ReserveTable {

    Sms sms = new Sms();
    String telephone = "+48 509 934 004";
    String smsGateway = "";

    public SmsAdapter() {
    }

    public boolean reserve(String person, Date date, int numberOfPeople) {
        if (sms.checkLine()) {
            sms.sendSms(person + " at " + date.toString(), telephone, smsGateway + " for " + numberOfPeople);
        }
        return true;
    }
}