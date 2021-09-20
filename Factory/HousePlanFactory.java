public class HousePlanFactory{
     static HousePlan houseplan;
   public static HousePlan createHousePlan(String type)
   { 
     if(type.equals("log cabin")){
        houseplan =new LogCabinPlan();
    } else if(type.equals("Tiny Home")){
        houseplan = new TinyHomePlan();
    } else if (type.equals("Contemporary Home")){
        houseplan = new ContemporaryPlan();
    }
    return houseplan;
   
   }
}
