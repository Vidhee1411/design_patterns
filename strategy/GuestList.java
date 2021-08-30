package strategy;
import java.util.*;
public class GuestList

{
public static void main(String args[]) 
{

   public String title;
    ArrayList <String>people = new ArrayList<String>();
    
    SearchBehavior  searchBehavior;
    
    public GuestList(String title)
    {
        this.title= title;
    }
    public boolean add (String person )
    { 
        if(searchBehavior.contains(people,person))
        {
            return false;
        }
        else
        {
            people.add(person);
            return true;
        }
        
        
    }
    
    
    public boolean remove(String person)
    {
        if(searchBehavior.contains(people,person))
        {
            people.remove(person);
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
        LinearsSearch lsearch = new LinearsSearch();
        
    }
    public ArrayList<String> getList()
    {
        for( String str: ArrayList)
        {
            System.out.println(str);
        }
    
}
}
    







