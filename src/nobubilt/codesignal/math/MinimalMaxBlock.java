package nobubilt.codesignal.math;
import java.util.*;

public class MinimalMaxBlock {
	 /**
	     * For instance, consider the list {1, 2, 2, 3, 1, 4, 4, 4, 1, 2, 5}. 
	     * If we eliminate all instances of 2 (our k), the remaining blocks 
	     * would be {1}, {3, 1, 4, 4, 4, 1}, {5}, with the longest containing 6 elements.
	     *  Now, if we instead remove all instances of 1, the new remaining blocks 
	     *  would be {2, 2, 3}, {4, 4, 4}, {2, 5}, the longest of which contains 3 elements. 
	     *  As such, the function should return 1 in this case, as it leads to a minimally 
	     *  maximal block length.
	     * @param args
	     */
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4, 4, 4, 1, 2, 5);

	        // Timing brute force method
	        long startTimeBruteForce = System.nanoTime();
	        int bruteForceResult = minimalMaxBlockBruteforce(list); //1
	        long endTimeBruteForce = System.nanoTime();
	        long durationBruteForce = endTimeBruteForce - startTimeBruteForce;

	        // Timing optimized method
	        long startTimeOptimized = System.nanoTime();
	        int optimizedResult = minimalMaxBlock(list);  // 1
	        long endTimeOptimized = System.nanoTime();
	        long durationOptimized = endTimeOptimized - startTimeOptimized;

	        // Output results
	        System.out.println("Brute Force Result: " + bruteForceResult);
	        System.out.println("Brute Force Time: " + durationBruteForce + " nanoseconds");

	        System.out.println("Optimized Result: " + optimizedResult);
	        System.out.println("Optimized Time: " + durationOptimized + " nanoseconds");
	    }
	    public static int minimalMaxBlockBruteforce(List<Integer> list) {
	        int minMaxBlockSize = Integer.MAX_VALUE;
	        int minNum = -1;

	        Set<Integer> uniqueElements = new HashSet<>(list);

	        for (int num : uniqueElements) {
	            List<Integer> indices = new ArrayList<>();
	            for (int i = 0; i < list.size(); ++i) {
	                if (list.get(i) == num) {
	                    indices.add(i);
	                }
	            }
	            indices.add(0, -1);
	            indices.add(list.size());

	            int maxBlockSize = 0;
	            for (int i = 1; i < indices.size(); ++i) {
	                maxBlockSize = Math.max(maxBlockSize, indices.get(i) - indices.get(i - 1) - 1);
	            }

	            if (maxBlockSize < minMaxBlockSize) {
	                minMaxBlockSize = maxBlockSize;
	                minNum = num;
	            }
	        }

	        return minNum;
	    }

	    public static int minimalMaxBlock(List<Integer> list) {
	        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();
	        HashMap<Integer, Integer> maxBlockSizes = new HashMap<>();

	        for (int i = 0; i < list.size(); ++i) {
	            int num = list.get(i);
	            if (!lastOccurrence.containsKey(num)) {
	                maxBlockSizes.put(num, i);
	            } else {
	                int blockSize = i - lastOccurrence.get(num) - 1;
	                maxBlockSizes.put(num, Math.max(maxBlockSizes.get(num), blockSize));
	            }
	            lastOccurrence.put(num, i);
	        }
/**
 * Step 4: Handle Tail Blocks
Tail blocks are defined as blocks formed from the last occurrence of a number to the end 
of the list. For each number, we calculate the size of its tail block and update 
maxBlockSizes if necessary.
 */
	        for (Map.Entry<Integer, Integer> entry : lastOccurrence.entrySet()) {
	            int num = entry.getKey();
	            int pos = entry.getValue();
	            int blockSize = list.size() - pos - 1;
	            maxBlockSizes.put(num, Math.max(maxBlockSizes.get(num), blockSize));
	        }
/**
 * Step 5: Return the Optimal Result
Finally, we find the number associated with the smallest maximum block size in
 maxBlockSizes, and return it.
 */
	        int minNum = -1;
	        int minBlockSize = Integer.MAX_VALUE;
	        for (Map.Entry<Integer, Integer> entry : maxBlockSizes.entrySet()) {
	            if (entry.getValue() < minBlockSize) {
	                minBlockSize = entry.getValue();
	                minNum = entry.getKey();
	            }
	        }

	        return minNum;
	    }

	}

