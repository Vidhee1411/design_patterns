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
            return binarySearch(data, item, 0, data.size() - 1);

        }
        public boolean binarySearch(ArrayList<String> data, String item , int lowIndex, int highIndex){
            if (lowIndex > highIndex)
            return false;

        int midIndex = (lowIndex + highIndex) / 2;

        if (item.equals(data.get(midIndex))) {
            return true;
        } else if (item.compareTo(data.get(midIndex)) > 0) {
            return binarySearch(data, item, midIndex + 1, highIndex);
        } else {
            return binarySearch(data, item, 0, midIndex - 1);

        }
            
    }
}
    