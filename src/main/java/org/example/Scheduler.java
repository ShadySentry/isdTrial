package org.example;

import java.util.HashMap;
import java.util.Map;

public class Scheduler {

    public static void main(String[] args) {
        Map<String, Class> map = new HashMap<>();

        DeviceService service = new DeviceService();

        map.put("понедельник", Fax.class);
        map.put("вторинк", null);
        map.put("среда", null);
        map.put("четверг", null);
        map.put("пятница", Printer.class);
        map.put("субота", null);
        map.put("воскресенье", null);



        if (args==null || args.length == 0) {
            System.out.println("no args is specified");
            return;
        }


        for (String today : args) {
//            String today = "понедельник";

            if (map.containsKey(today)) {
                try {
                    Device device = (Device) map.get(today).getDeclaredConstructor().newInstance();
                    device.sendMessage(MessageService.renderMessage(today, device));
                } catch (Exception e) {
                    System.out.println("logging error");
                }
            }
        }


    }


}
