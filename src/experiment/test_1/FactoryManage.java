package experiment.test_1;

/**
 * @Author Ardien
 * @Date 5/27/2020 9:37 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class FactoryManage implements Factory {
    private Factory factory;

    FactoryManage() {
    }

    FactoryManage(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public Laptop create() {
        if (factory == null) throw new RuntimeException("factor is not null");
        return factory.create();
    }
}
