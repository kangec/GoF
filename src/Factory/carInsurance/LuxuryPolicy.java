package Factory.carInsurance;

/**
 * @Author Ardien
 * @Date 5/13/2020 3:50 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class LuxuryPolicy implements PolicyProducer{
    @Override
    public AutoInsurance getInsurObj() {
        return new LuxuryCarInsurance();
    }
}
