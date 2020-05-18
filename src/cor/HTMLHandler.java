package cor;

/**
 * @Author Ardien
 * @Date 2020/5/1 21:24
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class HTMLHandler implements Handler {
    @Override
    public boolean filter(Msg msg) {
        String replace = msg.getMsg()
                .replace("script", "脚本");
        msg.setMsg(replace);
        return true;
    }
}
