package bridge;

/**
 * @Author Ardien
 * @Date 6/4/2020 3:29 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class Ellipsoid implements GeoForm {
    private final double x;
    private final double y;
    private final double z;

    public Ellipsoid(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double computeVolume() {
        return (3.1415926 * x * y * z * 4) / 3;
    }
}
