package Factory.FactorMethod;

public class Client {
    public static void main(String[] args) {
        Car c = new AuDiFactor().createCar();
        Car d = new BydFactor().createCar();
        c.run();
        d.run();
    }
}
