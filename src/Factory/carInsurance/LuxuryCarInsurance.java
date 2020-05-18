package Factory.carInsurance;

/**
 * @Author Ardien
 * @Date 5/13/2020 3:41 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class LuxuryCarInsurance implements AutoInsurance {
    String description;

    @Override
    public String getInfo() {
        description="";
        return "豪华汽车保险";
    }
}
