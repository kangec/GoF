package experiment.test_6;

public class RSAAdapter implements AlgorithmAdapter {
    private final RAS rsa;

    public RSAAdapter() {
        rsa = new RAS();
    }

    @Override
    public void decode() {
        rsa.rsa();
        AlgorithmAdapter.super.decode();
    }

    @Override
    public void code() {
        rsa.rsa();
        AlgorithmAdapter.super.code();
    }
}
