package nobubilt.codesignal.interview.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class EfficientIntervalQueriesTreeSet {
	 public static int checkForOverlap(TreeMap<Integer, Integer> treeMap, int startQuery,
			 int endQuery)
	 {
		 Integer nextIntervalBeneath = treeMap.floorKey(endQuery);
		 if(nextIntervalBeneath != null && treeMap.containsKey(nextIntervalBeneath))
		 {
			if(treeMap.get(nextIntervalBeneath) >= startQuery)
			{
				return 1;
			}
		 }
		 return 0;
	 }
	 public static int removeEntry(TreeMap<Integer, Integer> treeMap, int startQuery,
			 int endQuery)
	 {
		 if(treeMap.containsKey(startQuery) && treeMap.get(startQuery) == endQuery)
		 {
			 treeMap.remove(startQuery);
		 }
		 return treeMap.size();
	 }
	 public static List<Integer> solution(List<int[]> intervals, List<int[]> queries) 
	 {
		 TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		 for(int[] row : intervals)
		 {
			 treeMap.put(row[0], row[1]);
		 }
		 
		 List<Integer> result = new ArrayList<>();
		 for(int[] queryRow : queries)
		 {
			 int operation = queryRow[0];
			 int startQuery = queryRow[1];
			 int endQuery = queryRow[2];
			 if(operation == 0)
			 {
				 int overLapInd = checkForOverlap(treeMap, startQuery, endQuery);
				 result.add(overLapInd);
			 }
			 else if(operation == 1)
			 {
				 int size = removeEntry(treeMap, startQuery, endQuery);
				 result.add(size);
			 }
		 }
		 return result;
	 }
/**
 * Storing Intervals:

Instead of using TreeMap<Integer, Integer[]>, consider using TreeMap<Integer, Integer> where 
the key is the start of the interval and the value is the end. This simplifies the logic.
Checking Overlaps:

For operation type 0, you can use floorKey to find the largest start point that is less than or 
equal to the query's end. Check if this interval overlaps with the query interval.
Removing Intervals:

For operation type 1, simply remove the interval using the start as the key.
 * @param intervals
 * @param queries
 * @return
 */
	
	 public static void main(String[] args)
	 {
//		 List<int[]> intervals = 
		 //new ArrayList(List.of(new int[]{1, 3}, new int[]{5, 7}, new int[]{9, 11}));
		 
//		 List<int[]> queries = 
		 //new ArrayList(List.of(new int[]{0, 2, 6}, new int[]{1, 5, 7},new int[]{0, 4, 6}));
		 
//		 //, the output should be [1, 2, 0].
//		 
//		 List<Integer> results = solution(intervals, queries);
//		 results.stream().forEach(rec-> System.out.print(rec + " "));
//		 
		 List<int[]> intervals2 = 
				 new ArrayList(List.of(new int[]{1, 3}, new int[]{5, 9}, new int[]{14, 19}));
		 List<int[]> queries2 =  
				 new ArrayList(List.of(new int[]{0, 4, 10}, new int[]{1, 5, 7}, new int[]{0, 4, 6}));
		 //, the output should be [1, 3, 1].
		 
		 List<Integer> results2 = solution(intervals2, queries2);
		 results2.stream().forEach(rec-> System.out.print(rec + " "));
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static List<Integer> solutiont(List<int[]> intervals, List<int[]> queries) {
	        // TODO: implement the solution here
	        List<Integer> result = new ArrayList<>();
	        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
	        for(int[] row : intervals)
	        {
	            int start = row[0];
	            int end = row[1];
	            treeMap.put(start, end);
	        
	        }
	        
	        for(int[] query : queries)
	        {
	            int operation = query[0];
	            int queryStart = query[1];
	            int queryEnd = query[2];
	            
	            if(operation == 0)
	            {
	                checkIntervalOverlapt(queryStart, queryEnd, result, treeMap); 
	            }
	            else if(operation == 1)
	            {
	                removeExistancet(queryStart, queryEnd, result, treeMap);
	            }
	            
	        }
	        return result;
	    }
	   
	    protected static void removeExistancet(int queryStart, int queryEnd, 
	    		List<Integer> result, TreeMap<Integer, Integer> treeMap)
	    {
	        if(treeMap.containsKey(queryStart) && treeMap.get(queryStart).equals(queryEnd))
	        {  
	            treeMap.remove(queryStart);       
	        }
	        result.add(treeMap.size()); 
	    }
	    
	    public static void checkIntervalOverlapt(int queryStart, int queryEnd, 
	    		List<Integer> result, TreeMap<Integer, Integer> treeMap)
	    {
	        boolean hasOverlap = false;
	        Integer upperQueryStart =  treeMap.floorKey(queryEnd);
	        if((upperQueryStart != null && treeMap.get(upperQueryStart) >= queryStart))
	        {
	            hasOverlap = true;
	        }
	         int outcome = hasOverlap ? 1 : 0;
	        result.add(outcome); 
	    }
}
