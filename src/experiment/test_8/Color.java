package experiment.test_8;

public interface Color {
    default void bepaint(String penType, String name) {
        System.out.println("颜色：" + this.getClass().getSimpleName() + "\t画笔：" + penType + "\t物品：" + name);
    }
}
