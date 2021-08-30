package strategy;

import java.util.ArrayList;
interface SearchBehavior
{       
    public boolean contains(ArrayList<String> data, String item);
   /**  {
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i)==item)
            {
                return true;
            } 
           
        }
        return false;
        
    }
    */
}

