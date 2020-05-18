package foundation;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Author Ardien
 * @Date 2019/10/7 18:45
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class B_1_1 {

    public static void  main(String[] args) {
        int a = 0;
        int n = -1;
        int count = 1;
        long[] items ;
        long sn = 0;
        long tn = 0;
        System.out.println("分别输入‘a’ 和 ‘n’ 的值：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        n = input.nextInt();
        items = new long[n+1];
        if (n < 0) return;
        while (count <= n) {
            tn = tn + a;
            sn = tn + sn;
            a = a * 10;
            items[count] = tn;
            ++count;
        }

        for(int i = 1; i <= n; i++)
        {
            System.out.print(items[i]);
            if (i != n)
                System.out.print(" + ");
            else {
                System.out.print(" = ");
            }
        }
        System.out.println(sn);
    }
}
