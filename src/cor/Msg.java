package cor;

/**
 * @Author Ardien
 * @Date 2020/5/1 21:00
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Msg {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
