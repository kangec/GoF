package cor;

import java.util.ArrayList;
import java.util.List;
/*************************************/
/**
 * @Author Ardien
 * @Date 2020/5/1 20:59
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好<script>,欢迎访问 ardien.com,大家都是996</script>");
        HandlerChain chain = new HandlerChain();
        HandlerChain chain2 = new HandlerChain();
        chain.add(new ScriptHandler()).add(new TimeHandler());
        chain2.add(new HTMLHandler());
        chain.add(chain2);

        chain.filter(msg);
        System.out.println(msg.getMsg());
    }
}
