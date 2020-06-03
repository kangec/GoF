package experiment.test_6;

public class DESAdapter implements AlgorithmAdapter {
    private final DES des;

    public DESAdapter() {
        des = new DES();
    }

    @Override
    public void decode() {
        des.des();
        AlgorithmAdapter.super.decode();
    }

    @Override
    public void code() {
        des.des();
        AlgorithmAdapter.super.code();
    }
}
