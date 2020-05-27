package experiment.test_1;

/**
 * @Author Ardien
 * @Date 5/27/2020 9:58 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        FactoryManage factoryManage = new FactoryManage();
        factoryManage.setFactory(new DellFactory());
        Laptop laptop = factoryManage.create();
        laptop.computer();

        factoryManage.setFactory(new AcerFactory());
        laptop = factoryManage.create();
        laptop.computer();
    }
}
