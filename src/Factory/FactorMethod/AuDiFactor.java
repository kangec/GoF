package Factory.FactorMethod;

public class AuDiFactor implements CarFactor {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
