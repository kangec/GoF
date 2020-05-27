package experiment.test_2;

/**
 * @Author Ardien
 * @Date 5/27/2020 10:54 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory_KFC = FoodFactory.getFoodFactory(FoodFactory.KFC);
        FoodFactory foodFactory_MC = FoodFactory.getFoodFactory(FoodFactory.MCDONALDS);
        var cole_KFC = foodFactory_KFC.producingCole();
        var hamburg_KFC = foodFactory_KFC.producingHamburg();
        cole_KFC.attributes();
        hamburg_KFC.attributes();
    }
}
