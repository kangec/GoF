package experiment.test_3;

/**
 * @Author Ardien
 * @Date 5/28/2020 9:18 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        KFC kfc_1 = new KFC.Builder()
                .chicken("香辣烤鸡")
                .coke("冰镇可乐")
                .drinks("比利时巧克力风味拿铁")
                .hamburg("小龙虾烤鸡堡")
                .build();

        System.out.println(kfc_1);
    }
}
