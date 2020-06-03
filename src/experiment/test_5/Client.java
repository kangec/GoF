package experiment.test_5;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Plate plate = new Plate();

        List<Object> list = XMLUtil.getBean();

        list.forEach(element -> plate.add((MyElement) element));

        plate.eat();
    }
}
