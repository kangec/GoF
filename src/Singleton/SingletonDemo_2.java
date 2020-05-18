package Singleton;

/*
 *懒汉式单例模式,延迟加载
 * */
public class SingletonDemo_2 {
    private static SingletonDemo_2 s;

    private SingletonDemo_2() {} //构造器私有化

    public static synchronized SingletonDemo_2 getInstance() {
        if(s == null )
            s = new SingletonDemo_2();
        return s;
    }
}
