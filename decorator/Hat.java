public class Hat extends CharacterDecorator{
    /**
     * Hat constructor calling the super constructor
     * @param character the name of charcter where the hat should be added.
     */
    public Hat(Character character){
        super(character);
    }

    /**
     * Adding the hat to the potatoe head.
     */
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(3);
        this.sections.add(3,"-------------");}
   }
}