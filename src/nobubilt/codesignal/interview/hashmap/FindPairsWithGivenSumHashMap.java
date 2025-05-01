package nobubilt.codesignal.interview.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairsWithGivenSumHashMap {
    /**
     * You are required to find the number of pairs where one element is selected from 
     * array a and the other element is selected from array b, such that their sum 
     * is equal to the given number num.

    The expected time complexity for the task is O(len(a)+len(b)).
    {1, 2, 3, 4, 5}
    
      assertEquals(5, sumPairs(new int[]{1, 2, 3, 4, 5}, new int[]{5, 6, 7, 8, 9}, 10)
 assertEquals(2, sumPairs(new int[]{1, -2, 3, -4, 5}, new int[]{-5, 6, -7, 8, -9}, -2));

     * 
     *
     */	
    public static int sumPairs(int[] a, int[] b, int num) {
        // TODO: implement the function
        Map<Integer, List<Integer>> deltaToAvalueMap = new HashMap<>();
        for(int inx = 0; inx < a.length; inx++)
        {
            int delta = num - a[inx];
            if(!deltaToAvalueMap.containsKey(delta))
            {
               deltaToAvalueMap.put(delta, new ArrayList<>()); 
            }
            deltaToAvalueMap.get(delta).add(inx);
        }
        
        int counter = 0;
        for(int inx = 0; inx < b.length; inx++)
        {
            if(deltaToAvalueMap.containsKey(b[inx]))
            {
                counter += deltaToAvalueMap.get(b[inx]).size();
            }
        }
        return counter;
    }
    /**
     * Delta: 10 - 1 = 9    => 9 with inx { 0, }
    	   10 - 2 = 8    => 8 with inx { 1, }
    	   10 - 3 = 7    => 7 with inx { 2, }
    	   10 - 4 = 6    => 6 with inx { 3, }
    	   10 - 5 = 5    => 5 with inx { 4, }
     */
}
