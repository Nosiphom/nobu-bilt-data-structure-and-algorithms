package nobubilt.codesignal.array;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbersInRange {
/**
 *List<int[]> queries = Arrays.asList(
	        new int[]{1, 5},
	        new int[]{5, 1},
	        new int[]{1, 1},
	        new int[]{500, 500},
	        new int[]{1, 500},
	        new int[]{123, 321} // 3 5     4 6     15 
	    );
	    List<Long> expected = Arrays.asList(15L, 15L, 1L, 500L, 125250L, 44178L);
	   
 */
	
	public List<Long> sumNumbers(List<int[]> queries) {
        // TODO: Implement this method
        List<Long> result = new ArrayList<>();
        for(int[] rec : queries)
        {
            int startA = rec[0];
            int startB = rec[1];
            long outcome = 0L;
            if(startA > startB)
            {
                outcome = calculate(startB, startA);
            }
            else
            {
                outcome= calculate(startA, startB);
            }
            result.add(outcome);
        }
        return result;
    }
	
	
    
    public  Long calculate(int start, int end)
    {
        if(start == end){ return (long)start;}
        
        long total = 0L;
        long sumTillEnd = (long)end * (end + 1)/2;
        long sumBeforeStart = (long) (start - 1) *(start)/2;
        total = sumTillEnd - sumBeforeStart;
        return total;
    }
}
