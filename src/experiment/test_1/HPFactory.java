package experiment.test_1;

/**
 * @Author Ardien
 * @Date 5/27/2020 9:33 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class HPFactory implements Factory {
    @Override
    public Laptop create() {
        return new HPLaptop();
    }
}
