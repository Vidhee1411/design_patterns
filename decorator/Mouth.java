public class Mouth extends CharacterDecorator{
    public Mouth(Character character){
        super(character);

    }
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(6);
        this.sections.add(6,"  \\  ---- / ");}

    }
}