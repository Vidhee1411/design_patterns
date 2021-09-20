public class HousePlanFactory{
     
    static HousePlan houseplan;

     /**
      * Creating method createHousePlan which call the different house.
      * @param type the type is the name of the house.
      * @return the houseplan.
      */
   public static HousePlan createHousePlan(String type)
   { 
     if(type.equals("log cabin")){
        houseplan =new LogCabinPlan();
    } else if(type.equals("Tiny Home")){
        houseplan = new TinyHomePlan();
    } else if (type.equals("contemporary home")){
        houseplan = new ContemporaryPlan();
    }
    return houseplan;
   }
}
