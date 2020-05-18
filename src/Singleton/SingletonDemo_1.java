package Singleton;

/*
 *饿汉式单例模式,立即加载。
 * */
public class SingletonDemo_1 {
    private final static SingletonDemo_1 s = new SingletonDemo_1();

    private SingletonDemo_1() {} //构造器私有化

    public SingletonDemo_1 getInstance() {
        return s;
    }
}

