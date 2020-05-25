package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) throws Exception{
        SingletonDemo_6 s1 = SingletonDemo_6.getInstance();
        SingletonDemo_6 s2 = SingletonDemo_6.getInstance();
        System.out.println(s1);
        /*
        //通过反射破解单例模式
        Class<SingletonDemo_6> class1 = (Class<SingletonDemo_6>) Class.forName("Singleton.SingletonDemo_6");
        Constructor<SingletonDemo_6> c = class1.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo_6 s3 = c.newInstance();
        SingletonDemo_6 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);
        */

        //通过反序列化破解单例模式
        FileOutputStream fileOutputStream = new FileOutputStream("d:/b.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(s1);
        oos.close();
        fileOutputStream.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/b.dat"));
        SingletonDemo_6 s5 = (SingletonDemo_6) ois.readObject();
        System.out.println(s5 == s1);

    }
}
