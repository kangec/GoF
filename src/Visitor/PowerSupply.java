package Visitor;
/*================================*/
/* This is a class to be visited  */
/*================================*/

public class PowerSupply implements ComputerParts {

    public static final String NAME = "PowerSupply";
    public static final String FEATURES = "Power Supply. SHBJ6";
    private final double PRICE = 20.00;

    public String getName() {
        return NAME;
    }

    public double getPrice() {
        return PRICE;
    }

    public String getDescription() {
        return FEATURES;
    }

    public void accept(Visitor v) {
        System.out.println("PowerSupply has been visited.");
        v.visitPowerSupply(this);
    }
}
