package org.example;

public class MessageService {
    static public String renderMessage(String message, Device device) {
        if (device == null) {
            System.out.println("logging error");
            return null;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(device.getHeader())
                .append(" ")
                .append(message);

        return builder.toString();
    }
}
