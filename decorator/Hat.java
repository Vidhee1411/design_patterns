public class Hat extends CharacterDecorator{
    public Hat(Character character){
        super(character);

    }
    public void customize(){
        for(int i=0;i<sections.size();i++)
        {
        this.sections.remove(3);
        this.sections.add(3,"-------------");}
   }
}