import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials=new ArrayList<>();
    protected ArrayList<String> features=new ArrayList<>();
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    protected  abstract void  setMaterials();
    protected  abstract void setFeatures();
    
    /**
     * Creating the houseplan constructor and setting the variables.
     * @param numRooms the num of rooms
     * @param numWindows the number of windows
     * @param squareFeet the squarefeet
     */
    public HousePlan(int numRooms, int numWindows,int squareFeet)
    {
        this.numRooms=numRooms;
        this.numWindows=numWindows;
        this.squareFeet=squareFeet;
        setMaterials();
        setFeatures();
    }
    
    /**
     * Method getting the materials
     * @return materials
     */
    public ArrayList<String> getMaterials(){
        return materials;
    }
    
    /**
     * Method getting the features
     * @return features
     */
    public ArrayList<String> getFeatures(){
        return features;
    }

    /**
     * Method getting the number of rooms
     * @return numRooms
     */
    public int getNumRooms(){
        return this.numRooms;
    }

    /**
     * Method getting the number of windows
     * @return numWindows
     */
    public int getNumWindows(){
        return this.numWindows;
    }
    
    /**
     * Method getting the number of squareFeet
     * @return squareFeet
     */
    public int getSquareFeet(){
        return this.squareFeet;
    }
    
    /**
     * Method concating the strings
     * @return result
     */
     public String toString(){
         String result="";
         result += "Square Feet:"+getSquareFeet()+ "\n";
         result += "Room:" +getNumRooms()+"\n";
         result += "Windows:" +getNumWindows()+ "\n";
         result += "Materials: \n";
         result += "     -"+getMaterials() + "\n";
         result += "\n Features: \n";
         result += "    -"+getFeatures() +"\n";
         return result;
        }
}
