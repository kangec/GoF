package Visitor;
/*================================*/
/* This is a class to be visited  */
/*================================*/

public class Memory implements ComputerParts {

    public static final String NAME = "Memory";
    public static final String FEATURES = "Memory. Intel HK55";
    private final double PRICE = 30.00;

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
        System.out.println("Memory has been visited.");
        v.visitMemory(this);
    }
}