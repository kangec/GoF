package Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 *防止反射和反序列化破解单例模式
 * */
public class SingletonDemo_6 implements Serializable {
    private static SingletonDemo_6 s;

    private SingletonDemo_6() {
        if(s != null) {
            throw new RuntimeException();
        }
    } //构造器私有化

    public static synchronized SingletonDemo_6 getInstance() {
        if(s == null )
            s = new SingletonDemo_6();
        return s;
    }

    private Object readResolve() throws ObjectStreamException {
        return s;
    }
}
