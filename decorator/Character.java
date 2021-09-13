import java.util.ArrayList;
public class Character{
    ArrayList<String> sections;
     
    protected Character(){
        sections = new ArrayList<>();
        sections.add("             ");
        sections.add("    -----    ");
        sections.add("   |     |   ");
        sections.add("  /       \\ ");
        sections.add(" |         |");
        sections.add(" |         |  ");
        sections.add("  \\       / ");
        sections.add("   \\_____/  ");
        
    }

    void draw(){
        for(int i=0;i<sections.size();i++)
        {
            System.out.println(sections.get(i));
        }
    }
}
