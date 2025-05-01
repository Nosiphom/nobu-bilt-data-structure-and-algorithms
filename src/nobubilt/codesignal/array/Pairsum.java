package nobubilt.codesignal.array;

import java.util.HashMap;
import java.util.Map;

public class Pairsum {
	/**
	 * // TODO: implement a function that finds a pair of numbers whose sum equals the target
	 *  int[] arr = {1, 2, 3, 4, 9, 10};
	            int target = 13;
	            int[] expected = {4, 9};
	            
	  int[] arr = {-66, 45, 95, -84, -35, -70, 26, 94, 15, 20, 66, -3, -47, -76, 24, -93, -1, 
	  10, 55, 95, 96, -100, 78, 14, -32, 84,  -42, 51, -74, -19, -93, -95, -94, 66, 38, -98,
	   -3, 75, -45, 8, 85, -93, 35, -44, 95, 12, 26, 41, -41, -12, -41, 73, -44, 94, 17, 
	  -26, -95, 6, 42, 64, -75, -53, 61, 85, -25, -70, 90, -15, 84, 82, 28, 8, 29, 71, -52,
	   -23, -28, 50, 27, 29, 0, 50, -92, 22, -38, 90, 3, 6, 70, -56, -7, 40, 79, 98, 72, 88, 
	   -5, -78, 12, 69};
    int target = -10;
    int[] expected = {66, -76};       
	 */
	
	public int[] solution(int[] arr, int target) {
        // TODO: implement a function that finds a pair of numbers whose sum equals the target
          Map<Integer, Integer> complimentSum = new HashMap<>();
     
        for(int inx = 0; inx < arr.length; inx++)
        {
            int delta = target - arr[inx];
            if(complimentSum.containsKey(arr[inx]) )
            {
             
                int[] pair = new int[2];
                pair[0] = arr[complimentSum.get(arr[inx])];
                pair[1] = arr[inx];
                return pair;
            }
            complimentSum.put(delta, inx);
        }
        return new int[]{};
    }
}
