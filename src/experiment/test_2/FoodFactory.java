package experiment.test_2;

/**
 * @Author Ardien
 * @Date 5/27/2020 10:19 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public abstract class FoodFactory {
    public static final String KFC = "KFC";
    public static final String MCDONALDS = "MCDONALDS";

    public static FoodFactory getFoodFactory(String type) {
        FoodFactory foodFactory = null;
        switch (type) {
            case MCDONALDS:
                foodFactory = new McDonaldsFoodFactory();
                break;
            case KFC:
                foodFactory = new KFCFoodFactory();
                break;
            default:
                throw new RuntimeException("FoodFactory is not null!");
        }
        return foodFactory;
    }

    public abstract Cole producingCole();

    public abstract Hamburg producingHamburg();
}
