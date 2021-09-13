public class Eyes extends CharacterDecorator
{
    /**
     * Eyes constructor calling the super constructor
     * @param character the name of charcter where the eyes should be added.
     */
    public Eyes(Character character){
        super(character);
    }
    
    /**
     * Adding the eyes to the potatoe head.
     */
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(4);
        this.sections.add(4," |  o   o  |");
        }
    }
}