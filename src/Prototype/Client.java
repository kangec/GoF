package Prototype;

import java.util.Date;

/**
 * 原型模式 Sheep，浅复制。
 * */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("Ardient",new Date(3232321L));
        System.out.println(s1);

        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2);
    }
}
