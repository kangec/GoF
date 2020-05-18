package Factory.FactorMethod;

public class BydFactor implements CarFactor {

    @Override public Car createCar() { return new Byd();
    }
}
