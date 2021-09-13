import java.util.ArrayList;

public class Character{
    ArrayList<String> sections;
    /**
     * Initializing the array 
     */
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
    
    /**
     * Methid draw which prints the ArrayList
     */
    void draw(){
        for(int i=0;i<sections.size();i++)
        {
            System.out.println(sections.get(i));
        }
    }
}
