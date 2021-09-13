public class Eyes extends CharacterDecorator
{
    public Eyes(Character character){
        super(character);
    }
    
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(4);
        this.sections.add(4," |  o   o  |");
        }
    }
}