public abstract class CharacterDecorator extends Character{
    protected Character character;
    public abstract void customize();
    
    /** 
     * CharacterDecorator constructor which copys the sections to this. sections
     * @param character the name of character which should get customize.
    */
    public CharacterDecorator(Character character){
        this.character=character;
        for(int i=0;i<sections.size();i++)
        {
            character.sections.add(i,sections.get(i));
        }
        customize();
        }
}
    