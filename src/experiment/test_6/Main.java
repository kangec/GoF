package experiment.test_6;

public class Main {

    public static void main(String[] args) {
        AlgorithmAdapter adapter = (AlgorithmAdapter) XMLUtil.getBean();
        adapter.code();
        adapter.decode();
    }
}
