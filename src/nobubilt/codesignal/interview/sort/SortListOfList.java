package nobubilt.codesignal.interview.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfList {

	public static void main(String[] args)
	{
		
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(4, -3, -5), //6
                Arrays.asList(-3, -5, 4), //3
                Arrays.asList(-5, 4, -3), //2
                Arrays.asList(-3, 4, -5), //4
                Arrays.asList(-5, -3, 4),  //1
                Arrays.asList(4, -5, -3)  //5
            );		
		Collections.sort(listOfLists, Comparator.comparing((List<Integer> list) -> list.get(0)).
		        thenComparing(list -> list.get(1)).
		        thenComparing(list -> list.get(2)));
		
		   System.out.println("*******************");
	     
		 // Print the sorted list
	    for (List<Integer> list : listOfLists) {
	        System.out.println(list);       
	    }
	        
	        int[] array = {1, 2, 3, 4, 5};
	        
	        // Convert int[] to List<Integer> using streams
	        List<Integer> listNum = Arrays.stream(array)
	                                   .boxed()
	                                   .collect(Collectors.toList());       
	        System.out.println(listNum); // Output: [1, 2, 3, 4, 5]
/**
 * [-5, -3, 4]
[-5, 4, -3]
[-3, -5, 4]
[-3, 4, -5]
[4, -5, -3]
[4, -3, -5]
	         */
	    	    
	}
}
