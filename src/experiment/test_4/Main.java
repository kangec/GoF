package experiment.test_4;

/**
 * @Author Ardien
 * @Date 5/28/2020 9:41 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        PrintSpooler printSpooler1 = PrintSpooler.getInstance();
        PrintSpooler printSpooler2 = PrintSpooler.getInstance();

        System.out.println("printSpooler1 == printSpooler2: " + (printSpooler1 == printSpooler2));
    }
}
