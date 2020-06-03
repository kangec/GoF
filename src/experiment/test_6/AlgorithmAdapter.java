package experiment.test_6;

public interface AlgorithmAdapter {
    default void decode() {
        System.out.println("===========解码===========");
    }

    default void code() {
        System.out.println("===========加密===========");
    }
}
