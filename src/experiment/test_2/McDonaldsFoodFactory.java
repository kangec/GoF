package experiment.test_2;

/**
 * @Author Ardien
 * @Date 5/27/2020 10:45 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class McDonaldsFoodFactory extends FoodFactory {
    @Override
    public Cole producingCole() {
        return new McDonaldsCole();
    }

    @Override
    public Hamburg producingHamburg() {
        return new McDonaldsHamburg();
    }
}
