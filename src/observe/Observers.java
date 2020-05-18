package observe;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Ardien
 * @Date 2020/5/2 12:28
 * @Email ardien@126.com
 * @Version 1.0
 **/
public interface Observers {
    List<Observe> observes = new ArrayList<>();

    default public void add(@NotNull Observe observe) {
         observes.add(observe);
    }

    default public Observe remove(int index) {
        return observes.remove(index);
    }

    default public void notifyObserves() {
        for (Observe observe : observes) {
            observe.response();
        }
    }
}
