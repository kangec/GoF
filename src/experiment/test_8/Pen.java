package experiment.test_8;

public abstract class Pen {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(String name) {
        color.bepaint(this.getClass().getSimpleName(), name);
    }
}
