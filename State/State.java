/**
 * The state interface has four methods which are overridden by the easy,medium,hard class.
 */
public interface State {
    
    /**
     * The getNum method returns a random number between 1 to 10
     * @return the random number
     */
    public int getNum();
    
    /**
     * The getOperation method returns the random operation.
     * @return the random operation
     */
    public String getOperation();
    
    /**
     * The levelUp method set the state level up.
     */
    public void levelUp();
    
    /**
     * The levelDown method set the state level down.
     */
    public void levelDown();
}