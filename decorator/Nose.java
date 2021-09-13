public class Nose extends CharacterDecorator{
    /**
     * Nose constructor calling the super constructor
     * @param character the name of charcter where the nose should be added.
     */
    public Nose(Character character){
        super(character);
    }

    /**
     * Adding the nose to the potatoe head.
     */
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(5);
        this.sections.add(5," |    >     |");}

    }
}