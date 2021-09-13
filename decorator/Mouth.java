public class Mouth extends CharacterDecorator{
    /**
     * Mouth constructor calling the super constructor
     * @param character the name of charcter where the mouth should be added.
     */
    public Mouth(Character character){
        super(character);
     }
    
     /**
      * Adding the mouth to the potatoe head.
      */
     public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(6);
        this.sections.add(6,"  \\  ---- / ");
        }
    }
}