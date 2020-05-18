package cor;

/**
 * @Author Ardien
 * @Date 2020/5/1 21:10
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class TimeHandler implements Handler{
    @Override
    public boolean filter(Msg msg) {
        String replace = msg.getMsg()
                .replace("996", "995");
        msg.setMsg(replace);
        return false;
    }
}
