package com.sda.webinar.designpatterns.facade.extLib;

import java.net.InetAddress;

public class ConnectionImpl implements Connection {
    public boolean open(InetAddress address, int port) {
        return true;
    }

    public boolean send(byte[] message, int length) {
        return true;
    }

    public boolean close() {
        return true;
    }
}
