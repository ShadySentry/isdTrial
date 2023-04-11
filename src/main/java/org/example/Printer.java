package org.example;

public class Printer extends Device {
    //    String serviceInfo = "сервиная инфомрация о принтере";
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    public Printer() {
        super("printer service info");
    }
}
