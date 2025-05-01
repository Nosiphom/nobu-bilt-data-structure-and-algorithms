package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RangeMinimumQueryOptimization {
/**
 * Our task here involves an array composed of at most 1,000 elements and potentially millions of queries. Each query is a pair of integers denoted as l and r, which correspond to some indices in the array. Your goal is to write a Java method that, for each query, returns the minimum value in the array between indices l and r (inclusive).

The catch is this: rather than directly finding the minimum value for each query one by one, we're required to optimize the process. The idea here is to precalculate the minimum value for each possible l and r, store these values, and then proceed with the queries. This way, we can simplify the problem and enhance the speed of our solution by eliminating redundant computations.

The method will accept three parameters: arr, Ls, and Rs. The primary array is arr, while Ls and Rs are ArrayLists that hold the l and r values respectively for each query. For instance, let's say you have an array like {2, 1, 3, 7, 5} and the following queries: {0, 2, 4} and {1, 3, 4}. The aim of our method would be to return {1, 3, 5} as the minimum values within the ranges of the three queries.
Initially, we'll set n to be the size of the given array and create a two-dimensional array, precalc, filled with zeroes. This array will store all the precalculated minimums for all possible range pairs (l, r).
Now, we shall precalculate the minimum value for all possible l and r pairs. This is essentially the brute force approach, but by doing this upfront, we optimize our subsequent queries. We loop through every possible range within arr, updating the minimum value found for that range, and store this minimum value in our precalc two-dimensional array.
 With our precalculation complete, we're ready to process the actual queries (the pairs of l and r). For each query, we use the precalculated values in precalc to quickly find the minimum value for that query's range. These values are then added to our result list, res.
 *
 */
	  public static List<Integer> queryMin(int[] arr, List<Integer> Ls, List<Integer> Rs) {
	        int n = arr.length;
	        int[][] precalc = new int[n][n];
	        for (int l = 0; l < n; ++l) {
	            int minVal = arr[l];
	            for (int r = l; r < n; ++r) {
	                minVal = Math.min(minVal, arr[r]);
	                precalc[l][r] = minVal;
	            }
	        }
	        Set<Integer> set = new HashSet<>();
	        List<Integer> res = new ArrayList<>();

	        for (int i = 0; i < Ls.size(); ++i) {
	            int l = Ls.get(i);
	            int r = Rs.get(i);
	            res.add(precalc[l][r]);
	        }
	        
	        return res;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {2, 1, 3, 7, 5};
	        List<Integer> Ls = new ArrayList<>();
	        List<Integer> Rs = new ArrayList<>();
	        
	        Ls.add(0);
	        Rs.add(1);
	        Ls.add(2);
	        Rs.add(3);
	        Ls.add(4);
	        Rs.add(4);
	        
	        List<Integer> result = queryMin(arr, Ls, Rs);
	        
	        for (int val : result) {
	            System.out.print(val + " "); //1 3 5 
	        }
	        
	        System.out.println();
	        System.out.println();
	        
	    }
	    
	    
	   
	   
}
