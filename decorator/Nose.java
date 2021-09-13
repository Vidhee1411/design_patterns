public class Nose extends CharacterDecorator{
    public Nose(Character character){
        super(character);

    }
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(5);
        this.sections.add(5," |    >     |");}

    }
}