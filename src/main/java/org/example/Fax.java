package org.example;

public class Fax extends Device {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    public Fax() {
        super("printer service info");
    }
}
