public class LogCabinPlan extends HousePlan {
    
    /**
     * LogCabinPlan constructor calling the super constructor
     * and passing the aruguments.
     */
    public LogCabinPlan(){
        super(2,10,1800);
    }

    /**
     * setMaterials adding the materials into the arraylist
     */
    protected void setMaterials(){
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * setFeatures adding the features into the arrayList
     */
    protected void setFeatures(){
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * toString method return the home name and the super toString().
     * @return the result string.
     */
    public String toString(){
        String result = "Log Cabin   \n";
        result += super.toString();
        return result;
    }
}
