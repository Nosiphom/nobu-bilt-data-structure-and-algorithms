package nobubilt.codesignal.array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ReverseInParenthesis {
	static boolean canLeapThru(int minDelta, int[] arr)
	{
		Set<Integer> unique = new HashSet<>();
		int curr = minDelta;
		unique.add(minDelta);
		while(curr < arr[arr.length-1])
		{
			curr += minDelta;
			unique.add(curr);
		}
		
		for(int num : arr)
		{
			if(unique.contains(num))
			{
				return false;
			}
		}
		return true;
	}
//19, 32, 11, 23};
	static int avoidObstacles(int[] inputArray) {
		Arrays.sort(inputArray); // 11 19 23 32
		int minDelta = 1000;
		for(int inx = 0; inx < inputArray.length-1; inx++)
		{
			int currDelta = inputArray[inx+1] - inputArray[inx] -1;
			if(currDelta < minDelta && currDelta != 1)
			{
				minDelta = currDelta;
			}
			if(minDelta == 1000 || currDelta ==1)
			{
				minDelta = 1;
			}
		}
		
		while(!canLeapThru(minDelta, inputArray) && minDelta < 1000)
		{
			++minDelta;
		}
		return minDelta;
	}
	
	static String solution(String inputString) 
	{
		Stack<Character> stack = new Stack<>();
		Deque<Character> queue = new ArrayDeque<>();
		int len = inputString.length();
		StringBuilder sb = new StringBuilder();
		for(int inx = 0; inx < len;  ++inx)
		{
			char ch = inputString.charAt(inx);
			if(ch == '(' || (!stack.isEmpty() && ch != ')'))
			{
				stack.push(ch);
			}
			else if(ch == ')')//foo(bar(baz)lop)blim"
			{// q: b a z  
				// s: b a r b a z
				// nq : b a r b a z 
				while(!stack.isEmpty())
				{
					if(stack.peek() == '(')
					{
						stack.pop();
						while(!stack.isEmpty() && !queue.isEmpty())
						{
							stack.push(queue.pollFirst());
						}
					}
					else
					{
						queue.addFirst(stack.pop());
					}
				}
				while(!queue.isEmpty())
				{
					sb.append(queue.pollFirst());
				}
			}
			else
			{
				sb.append(ch);
			}
			
			
		}
		return sb.toString(); //foob a r b a z
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println();
		int[] inputArray = {19, 32, 11, 23};
		System.out.println(avoidObstacles(inputArray));
		System.out.println();
		System.out.println(solution("foo(bar(baz)lop)blim"));  // =>  foopolbazrabblim
		System.out.println();
//		System.out.println(isIPfourAdd("172.16.254.1"));
		System.out.println();
//		System.out.println(isIPfourAdd("172.316.254.1"));
//		System.out.println(depositProfit(100, 20, 170));
		System.out.println();
		int[][] image = 
			{{7,4,0,1}, 
			   {5,6,2,2}, 
			   {6,10,7,8}, 
			   {1,4,2,0}};
		int[][] result = boxBlur(image);
		
		for(int row=0; row < result.length; row++)
		{
			for(int col =0;  col< result[0].length; col++)
			{
				System.out.print(result[row][col] + " ");
			}
			System.out.println();
		}
		
	
	}
	
	
	static int depositProfit(int deposit, int rate, int threshold) {
	    int counter = 0;
	    double curr = (double)deposit;
	    double limit = (double)threshold;
	 //   System.out.println(rate);
	    float factor = (float) (rate/100f);
	    while(curr < limit)
	    {
	        float delta = (float) (factor * curr);
	       curr+= delta;

	       ++counter;
//	            System.out.println(factor);
//	       System.out.println(delta);
//	       System.out.println(curr);
	    }
	    return counter;
	}
	static int[][] boxBlur(int[][] image) {
	    int imageRows = image.length;
	    int imageCols = image[0].length;
	    int rows = imageRows -2;
	    int cols = imageCols -2;
	    int[][] result = new int[rows][cols];
	    List<Integer> list = new ArrayList<>();
	    int layer = 0;
	    for(int counter = 0; counter < cols; counter++)
	    { 
	        int total=0;   
	         for(int rowInx = 0; rowInx <  layer + 3 && rowInx < imageRows; rowInx++)
	        {
	            for(int colInx = counter; colInx <  counter + 3 && colInx < imageCols; colInx++)
	            {
	                total += image[rowInx][colInx];
	            }
	        }
	        list.add(total/9);
	    }
	    
	    int inx = 0;
	    for(int row=0; row < rows; row++)
	    {
	        for(int col =0; col < cols; col++)
	        {
	            if(inx  < list.size())
	            {
	                result[row][col] = list.get(inx);
	            inx++;
	            }
	            
	        }
	    }
	    
	    return result;
	}
	
	static int avoidObstaclest(int[] inputArray) {
	    Arrays.sort(inputArray);
	    ///inputArray: [1, 4, 10, 6, 2]
	    // 1  2  4  6  10
	    
	    // inputArray: [19, 32, 11, 23]
	    // 11 19 23 32
	    int minDelta = 1000;
	    for(int inx = 0; inx < inputArray.length-1; inx++)
	    {
	        int currDelta = inputArray[inx+1] - inputArray[inx]-1;
	        if(currDelta > 1 )
	        {
	            minDelta = Math.min(currDelta, minDelta);    
	        }
	    }
	     if(minDelta == 1000){minDelta = 2;}
	    while(!canLeap(minDelta,inputArray) && minDelta  < 1000)
	    {
	       ++minDelta;
	    }
	    return minDelta;
	}

	static boolean canLeap(int firstBreak, int[] inputArray)
	{
	    Set<Integer> breakingPoints = new HashSet<>();
	    int start = firstBreak;
	    breakingPoints.add(firstBreak);
	    while(start <= inputArray[inputArray.length-1])
	    {
	    	start += firstBreak;
	        breakingPoints.add(start);  // 3 6 9 12 15 18 21
	    }
	    for(int inx = 0; inx < inputArray.length; inx++)
	    {
	        if(breakingPoints.contains(inputArray[inx]))
	        {
	            return false;
	        }
	        
	        
	    }
	    
	    return true;
	}
	
	static boolean isIPfourAdd(String inputString)
	{
	    String[] digits = inputString.split("\\.");
	    if(digits.length != 4){return false;}
	    for(String num : digits)
	    {
	        int val = Integer.parseInt(num);
	        if(val < 0){return false;}
	        if(val > 255){return false;}
	    }
	    return true;
	}
	
	
	
	static String solutiont(String inputString) {
	    StringBuilder sb = new StringBuilder();
	    Stack<Character> stack = new Stack<>();
	    Deque<Character> deque = new ArrayDeque<>();
	    for(int inx = 0; inx < inputString.length(); inx++)
	    {//"foo(bar(baz))blim"
	    /**
	    * b a r ( b a z
	    d: z a b 
	    s: b a r z a b
	    "foobarzablopblim"
	    "foopolbazrabblim" - r
	    "foo(bar(baz)lop)blim"
	     ( b a r ( b a z 
	      d: z a b
	      s : b a r z a b l o p
	    *"foo pol baz rab blim
	    */
	        char ch = inputString.charAt(inx);
	        if(ch == '(' || (!stack.isEmpty() && ch != ')'))
	        {
	            stack.push(ch);
	        }
	        else if(ch == ')')
	        {
	            while(!stack.isEmpty())  // ( b a r ( b a z 
	            {
	                if(stack.peek() == '(')
	                {
	                    stack.pop();
	                    while(!deque.isEmpty() && !stack.isEmpty())
	                    {
	                        stack.push(deque.pollFirst());// ( 
	                    }
	                    break;
	                }
	                else
	                {
	                    deque.addFirst(stack.pop()); // 
	                }
	            }
	            while(!deque.isEmpty()) //  
	            {
	                sb.append(deque.pollFirst());  //
	            }
	        }
	        else
	        {
	            sb.append(ch);
	        }
	    }
	    
	    
	    return sb.toString();
	}


}
