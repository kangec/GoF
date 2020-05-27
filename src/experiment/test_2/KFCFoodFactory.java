package experiment.test_2;

/**
 * @Author Ardien
 * @Date 5/27/2020 10:34 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class KFCFoodFactory extends FoodFactory {
    @Override
    public Cole producingCole() {
        return new KFCCole();
    }

    @Override
    public Hamburg producingHamburg() {
        return new KFCHamburg();
    }
}
