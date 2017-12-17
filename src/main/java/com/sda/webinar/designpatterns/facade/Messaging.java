package com.sda.webinar.designpatterns.facade;

import com.sda.webinar.designpatterns.facade.extLib.Connection;
import org.apache.commons.lang.ArrayUtils;

import java.net.InetAddress;

public class Messaging {

    // Facade - it aggregates all methods into one method to send message
    private Connection connection;
    private InetAddress address;
    private int port;

    public Messaging(Connection connection, InetAddress byName, int i) {
    }

    public void sendMessage (Message message) {
        connection.open(address, port);
        byte[] data = null;

        byte[] recipient = message.getRecipient().getBytes();
        byte[] msg = message.getText().getBytes();
        byte[] status = message.getStatus().getBytes();

        data = ArrayUtils.addAll(recipient, msg);
        data = ArrayUtils.addAll(data, status);

        connection.send(data, data.length);

        connection.close();
    }
}