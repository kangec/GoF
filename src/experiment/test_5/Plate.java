package experiment.test_5;

import java.util.ArrayList;
import java.util.List;

public class Plate extends MyElement {

    public static List<MyElement> fruits = new ArrayList<>();

    public void add(MyElement element) {
        if (element == null) throw new NullPointerException("The parameter element cannot be empty!");
        fruits.add(element);
    }

    public void remove(MyElement element) {
        if (element == null) throw new NullPointerException("The parameter element cannot be empty!");
        fruits.remove(element);
    }

    @Override
    public void eat() {
        fruits.forEach(element -> element.eat());
    }

}
