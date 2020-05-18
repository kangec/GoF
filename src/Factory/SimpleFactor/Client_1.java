package Factory.SimpleFactor;

public class Client_1 {
    public static void main(String[] args) {
        Car car1 = CarFactor.createCar("比亚迪");
        Car car2 = CarFactor.createCar("奥迪");

        car1.run();
        car2.run();
    }
}
