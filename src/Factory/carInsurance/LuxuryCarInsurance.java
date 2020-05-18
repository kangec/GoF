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
        description="Auto insurance companies offer many different types of coverage. Most states require drivers to purchase a minimum amount of certain types of coverage. Here are brief descriptions of typical types of auto insurance coverage offered: \n" +
                " \tBodily Injury Liability Coverage: This coverage is mandatory in most states. Bodily injury coverage pays for medical bills, lost wages, rehabilitation, treatment and/or funeral costs for anyone injured or killed by your car. Such coverage will also pay for \"pain and suffering\" damages when a third party successfully sues. \n" +
                " \tProperty-Damage Liability Coverage: This coverage pays for the repair and replacement of vehicles and other property damaged when you or another authorized driver causes an accident. \n" +
                " \tPersonal Injury Protection: Pays medical expenses and some percentage of lost wages to you or anyone authorized to drive your car, no matter who caused the accident. \n" +
                " \tMedical Payments Coverage: Usually optional, this coverage pays for medical expenses over and above amounts covered by personal insurance protection, no matter who caused the accident. \n" +
                " \tUmbrella Policy: Pays for losses above and beyond those covered by either auto or homeowner's insurance; this is sometimes a cost-effective way to purchase liability insurance. \n" +
                " \tCollision Coverage: Pays for damage to your car, less any deductible, no matter who is at fault. If your car is financed, your lender may require you to buy this coverage and may even require a particular deductible amount. \n" +
                " \tComprehensive Coverage: Pays for damage to or loss of your car in the event of fire, theft or vandalism. Again, your lender may require this coverage if your car is financed. \n" +
                " \tProtection from an Uninsured or Underinsured Motorist Coverage: Protects you, passengers and anyone authorized to drive your car against bodily injury caused by an uninsured, underinsured or hit-and-run driver. \n" +
                " \tRental Reimbursement: Reimburses up to a specified amount per day for car rental or transportation costs while your car is being repaired following an accident. \n" +
                " \tTowing and Labor: Covers up to a specified amount for towing and labor charges when your car breaks down, whether or not there is an accident involved. \n" +
                " \tAuto Replacement: Pays for the full replacement value of the car, not its depreciated value. \n";
        return description;
    }
}
