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
        description=" \tProtection from an Uninsured or Underinsured Motorist Coverage: Protects you, passengers and anyone authorized to drive your car against bodily injury caused by an uninsured, underinsured or hit-and-run driver. \n" +
                " \tRental Reimbursement: Reimburses up to a specified amount per day for car rental or transportation costs while your car is being repaired following an accident. \n" +
                " \tTowing and Labor: Covers up to a specified amount for towing and labor charges when your car breaks down, whether or not there is an accident involved. \n" +
                " \tAuto Replacement: Pays for the full replacement value of the car, not its depreciated value. \n";
        return description;
    }
}
