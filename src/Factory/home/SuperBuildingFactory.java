package Factory.home;

//This is a sub class in the factory class hierarchy abstract factory pattern



public class SuperBuildingFactory extends BuildingFactory {

   public House getHouse(){
      return new SuperHouse();
   }

   public Condo getCondo(){
	  return new SuperCondo();
   }

    @Override
    public Factory.home.SemiDetacher getSemiDetacher() {
        return new SuperSemiDetacher();
    }
}
