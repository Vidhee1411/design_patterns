package strategy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Taken help from https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
 */

public class BinarySearch implements SearchBehavior
{
    public boolean contains(ArrayList<String> data, String item)
        {
            Collections.sort(data);
            int r=data.size()-1;
            int l =0;
            while(l<=r)
            {
                int m =l+(r-l)/2;

                if(data.get(m) == item)
                {
                    return true;
                }
                if(data.get(m).length()<item.length())
                {
                    l=m-1;
                }
                else
                {
                    r=m+1;
                }
            }
            return false;


        }
            
        }
    