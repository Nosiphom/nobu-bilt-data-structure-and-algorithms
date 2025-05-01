package nobubilt.codesignal.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosestPerfectSquareDivisor {
	
	  public List<Integer> solution(List<Integer> arr)
	  {
		  List<Integer> list = new ArrayList<>();
		  Map<Integer, Integer> squareMap = new HashMap<>();
		  for(int inx = 0; inx < arr.size(); inx++)
		  {
			  int num = arr.get(inx);
			  int sqrtNum = (int)Math.sqrt(num);
			  double diff = Math.sqrt(num) - (int)Math.sqrt(num);
			  if(diff >= 0.5)
			  {
				  sqrtNum = (int)Math.ceil(Math.sqrt(num));
			  }
			 
			  int square = sqrtNum * sqrtNum;
			  if(squareMap.containsKey(square))
			  {
				  list.add(squareMap.get(square));
				  continue;
			  }
			  int counter = 0;
			  for(int rec = 1; rec <= square; rec++)
			  {
				  if(square%rec == 0)
				  {
					  ++counter;
				  }
			  }
			  squareMap.put(square, counter);
			  list.add(counter);
		  }
		  
		  return list;
	  }
}
