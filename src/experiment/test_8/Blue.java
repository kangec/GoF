package experiment.test_8;

public class Blue implements Color {
    @Override
    public void bepaint(String penType, String name) {
        Color.super.bepaint(penType, name);
    }
}
