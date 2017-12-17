package com.sda.webinar.designpatterns.facade;

import com.sda.webinar.designpatterns.facade.extLib.Connection;
import com.sda.webinar.designpatterns.facade.extLib.ConnectionImpl;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        Message message = new Message();
        message.setText("Message");
        message.setRecipient("asdsad@asdsad.pl");
        message.setStatus("reserved");

        Connection connection = new ConnectionImpl();
        Messaging messaging = new Messaging(connection, InetAddress.getByName("192.168.1.14"), 22);

        messaging.sendMessage(message);

    }
}
