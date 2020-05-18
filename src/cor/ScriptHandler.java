package cor;

/**
 * @Author Ardien
 * @Date 2020/5/1 21:04
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class ScriptHandler implements Handler {

    @Override
    public boolean filter(Msg msg) {
        String replace = msg.getMsg()
                .replace("<", "[")
                .replace(">","]");
        msg.setMsg(replace);
        return true;
    }
}
