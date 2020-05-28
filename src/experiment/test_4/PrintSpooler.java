package experiment.test_4;

/**
 * @Author Ardien
 * @Date 5/28/2020 9:41 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class PrintSpooler {
    private static volatile PrintSpooler instance = null;

    private PrintSpooler() {
        if (instance != null)
            throw new RuntimeException("instance is null !");
    }

    public static PrintSpooler getInstance() {
        if (instance == null) {
            synchronized (PrintSpooler.class) {
                if (instance == null) {
                    instance = new PrintSpooler();
                }
            }
        }
        return instance;
    }

    public void delete() {
        System.out.println(this.getClass().getName() + ":  打印任务被删除");
    }

    public void shutdown() {
        System.out.println(this.getClass().getName() + ":  打印任务被终止");
    }

    public void change() {
        System.out.println(this.getClass().getName() + ":  打印任务被修改");
    }
}
