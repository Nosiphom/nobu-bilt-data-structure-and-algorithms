package nobubilt.codesignal.math;
import java.util.*;

public class ComboQuadSumFinder {
	
	 public static List<Integer> findQuadSum(int targetSum, List<Integer> numbers)
	 {
		 Map<Integer, List<Integer>> sumMap = new HashMap<>();
		 for(int left = 0; left < numbers.size()-1; left++)
		 {
			 for(int right = left +1; right < numbers.size(); right++)
			 {
				 int sum = numbers.get(left) + numbers.get(right);
				 sumMap.computeIfAbsent(sum, k -> new ArrayList<>());
				 sumMap.get(sum).add(left);
				 sumMap.get(sum).add(right);
			 }
		 }
		 
		 for(Integer sumkey : sumMap.keySet())
		 {
			 int complement = targetSum - sumkey;
			 if(sumMap.containsKey(complement))
			 {
				 List<Integer> sumInxList = sumMap.get(sumkey);
				 List<Integer> compInxList = sumMap.get(complement);
				 int sumLeft = sumInxList.get(0);
				 int sumRight = sumInxList.get(1);
				 int compLeft = compInxList.get(0);
				 int compRight = compInxList.get(1);
				 if(sumLeft != compLeft && sumLeft != compRight 
						 && sumRight != compLeft && sumRight != compRight)
				 {
					 return Arrays.asList(numbers.get(sumLeft),numbers.get(sumRight),
							 numbers.get(compLeft),numbers.get(compRight));
				 }
			 }
			 
		 }
		 return new ArrayList<>();
	 }
	 
	  public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 15, 2, 7, 8, 4);
	        int target = 24;
	        System.out.println(findQuadSum(target, numbers)); //[5, 4, 7, 8]
	    }
	   /**
    * (5, 15, 2, 7, 8, 4)
    * 5,  5,15=20  5,2=7    5,7=12  5,8=13   5,4=9
    * 15          15,2=17  15,7=22 15,8=23  15,4=19
    * 2                     2,7=9  2,8=10   2,4=6
    * 7                            7,8=13   7,4=11
    * 8                                     8,4=12
    * 
    * targetSum= 24 but   24 - 12=12 so pairs 5,7=12 & 8,4=12
    */	
}
