package cor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Ardien
 * @Date 2020/5/1 21:16
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class HandlerChain implements Handler {
    final static List<Handler> filter = new ArrayList<>();

    public HandlerChain add(Handler handler) {
        filter.add(handler);
        return this;
    }

    public boolean filter(Msg msg) {
        for (Handler handler : filter) {
            if (!handler.filter(msg)) return false;
        }
        return true;
    }
}
