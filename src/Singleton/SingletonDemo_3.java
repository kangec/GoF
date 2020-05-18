package Singleton;

/*
 * 静态内部类实现
 * 线程安全，调用效率高，延时加载
 * */
public class SingletonDemo_3 {
    private static class SingletonClassInstance {
        private static final SingletonDemo_3 s = new SingletonDemo_3();
    }

    public static SingletonDemo_3 getInstance() {
        return SingletonClassInstance.s;
    }

    private SingletonDemo_3() {
    }
}
