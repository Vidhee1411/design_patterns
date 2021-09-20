public class TinyHomePlan extends HousePlan{
    
    /**
     * TinyHomePlan constructor calling the super constructor
     * and passing the aruguments.
     */
    public TinyHomePlan(){
        super(1,5,200);
    }

    /**
     * setMaterials adding the materials into the arraylist
     */
    protected void setMaterials(){
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    /**
     * setFeatures adding the features into the arrayList
     */
    protected void setFeatures(){
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * toString method return the home name and the super toString().
     * @return the result string.
     */
    public String toString(){
        String result = "Tiny Home   \n";
        result += super.toString();
        return result;
    }
}
