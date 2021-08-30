package strategy;

import java.util.ArrayList;

public class LinearsSearch implements SearchBehavior
{
        public boolean contains(ArrayList<String> data, String item)
        {
            
            for(String n:data)
            {
            if(n == item)
            {
                return true;
            }
            
        }
        return false;
        
    
}
}