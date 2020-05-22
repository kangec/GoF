package bulider;

/**
 * @Author Ardien
 * @Date 5/21/2020 4:17 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class BuilderFactory {
    public HouseBuilder getUIBuilder(String str) {
        HouseBuilder builder = null;

        if (str.equals(HouseBuyerGUI.NORMAL_HOUSE)) {
            builder = new NormHouseBuilder();
        } else if (str.equals(HouseBuyerGUI.LUXURY_HOUSE)) {
            builder = new LuxHouseBuilder();
        } else if (str.equals(HouseBuyerGUI.ECONOMY_HOUSE)) {
            builder = new EconHouseBuilder();
        }
        return builder;
    }
}
