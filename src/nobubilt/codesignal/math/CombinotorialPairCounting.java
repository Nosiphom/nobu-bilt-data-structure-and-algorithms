package nobubilt.codesignal.math;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
/**
 * The central idea is to calculate the total number of pairs and then subtract from this total 
 * the number of pairs that share a common element. This will leave us with the count of pairs 
 * that do not share a common element, which is what we're after.

Firstly, we will calculate the total number of pairs possible in the array. In a set 
of n numbers, the number of pairs is given by the formula 
n⋅(n−1)/2. This is because each element in the set can pair with every other element, 
but we divide by 2 because the order of pairs doesn't matter (i.e., pair (a, b) is 
identical to pair (b, a)).
Secondly, we'll count the number of pairs that have at least one common element. 
To do this, we will use a HashMap to track each number's appearance in the pairs. 
For each number, we calculate how many pairs it appears in and sum these numbers up.
 * 
 *
 */
public class CombinotorialPairCounting {
	 
	    public static int nonCommonPairs(List<Map.Entry<Integer, Integer>> arr) {
	        Map<Integer, List<Integer>> indices = new HashMap<>();
	        int totalPairs = arr.size() * (arr.size() - 1) / 2;
	        
/**
 * With the first step completed, our next move is to populate the HashMap by iterating 
 * over the array of pairs. For each pair, we'll examine its two elements and either 
 * append the current index to the list of indices for this number (if it’s already 
 * in the HashMap) or start a new list for it (if it isn't).
 */
	        for (int idx = 0; idx < arr.size(); ++idx) {
	            Map.Entry<Integer, Integer> pair = arr.get(idx);
	            for (int num : new int[]{pair.getKey(), pair.getValue()}) {
	                indices.computeIfAbsent(num, k -> new ArrayList<>()).add(idx);
	            }
	        }
/**
 * We need to calculate the total pairs of indices that share at least one common element. 
 * For that, we'll consider each number in the array and count the number of times those 
 * numbers occur in different pairs. We'll use the same formula as before.

Finally, we subtract these common pairs from the total pairs to get our answer — the 
count of pairs without a common number.
 */
	        int commonPairs = 0;
	        for (Map.Entry<Integer, List<Integer>> entry : indices.entrySet()) {
	            int size = entry.getValue().size();
	            commonPairs += size * (size - 1) / 2;
	        }
	        
	        return totalPairs - commonPairs;
	    }

	    public static void main(String[] args) {
	        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
	        arr.add(new SimpleEntry<>(2, 5));
	        arr.add(new SimpleEntry<>(1, 6));
	        arr.add(new SimpleEntry<>(3, 2));
	        arr.add(new SimpleEntry<>(4, 2));
	        arr.add(new SimpleEntry<>(5, 1));
	        arr.add(new SimpleEntry<>(6, 3));
	        
	        System.out.println("Count of non-common pairs: " + nonCommonPairs(arr)); //8
	    }
}
