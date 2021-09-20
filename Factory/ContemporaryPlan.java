public class ContemporaryPlan extends HousePlan{

    /**
     * Contemporary constructor calling the super constructor
     * and passing the aruguments.
     */
    public ContemporaryPlan(){
        super(5,40,3000);
    }

    /**
     * setMaterials adding the materials into the arraylist
     */
    protected void setMaterials(){
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("COmposites");
    }

    /**
     * setFeatures adding the features into the arrayList
     */
    protected void setFeatures(){
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }

    /**
     * toString method return the home name and the super toString().
     * @return the result string.
     */
    public String toString(){   
        
        String result = "Contemporary Home  \n";
        result += super.toString();
        return result;
    }
    
}
