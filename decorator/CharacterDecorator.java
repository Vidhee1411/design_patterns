public  abstract class CharacterDecorator extends Character{
    protected Character character;
    public abstract void customize();
    
    public CharacterDecorator(Character character){
        this.character=character;
        for(int i=0;i<sections.size()-1;i++)
        {
            character.sections.add(i,sections.get(i));
        }
        customize();
        }
}
    