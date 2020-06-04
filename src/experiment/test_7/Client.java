package experiment.test_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        Map<Integer, Switch> iots = new HashMap<>();
        data.put(1, Air.class.getName());
        data.put(2, Light_1.class.getName());
        data.put(3, Light_2.class.getName());
        data.put(4, Light_3.class.getName());
        data.put(5, Light_4.class.getName());
        data.put(6, TV.class.getName());
        data.put(7, Fan.class.getName());

        open(iots, data);


        System.out.println("当前已启动设备：");
        iots.forEach((cc, str) -> {
            System.out.print(cc + "--" + str + "   ");
            str.power();
        });
        System.out.println("输入ID启动设备:");

    }

    public static void open(Map<Integer, Switch> iot_open, Map<Integer, String> iot_close) {
        System.out.println("当前可启动设备：");
        iot_close.forEach((cc, str) -> System.out.println("ID:" + cc + "--" + str));
        System.out.println("输入ID启动设备:");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        String clazzName = iot_close.get(id);
        try {
            Class clazz = Class.forName(clazzName);
            Switch iot = (Switch) clazz.newInstance();
            int size = iot_open.size() + 1;
            iot_open.put(size, iot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
