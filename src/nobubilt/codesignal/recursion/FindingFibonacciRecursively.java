package nobubilt.codesignal.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingFibonacciRecursively { 
/**
 * You are given a number n. Write a function that accepts this number as an argument and 
 * utilizes recursion to find the Fibonacci number at the index n. Your solution should 
 * have a complexity of O(n).

A Fibonacci sequence is a sequence of numbers where each number is the sum of the two 
preceding ones, usually starting with 0 and 1. Thus, the sequence starts 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ....

For instance, if n = 3, the function should return 2, and if n = 10, your function should 
return 55, which is the 10th number in the Fibonacci sequence.

Using an iterative approach to solve this problem is not allowed; you are required to solve 
it using recursion. Make sure to optimize your solution to have a complexity of 
O(n).
 */
	
	List<Long> fibList = new ArrayList<>();
    public long fibonacci(int n) {
    	Map<Integer, Long> memo = new HashMap<>();
        fib(n, memo);    
       return fibList.get(fibList.size()-1);
    }
    
    public long fib(int num, Map<Integer, Long> memo)
    {
        if(num ==0)
        {
            fibList.add(0L);
            return 0;
        }
        if(num ==1)
        {
            fibList.add(1L);
            return 1;
        }
        if(memo.containsKey(num))
        {
        	fibList.add(memo.get(num));
        	return memo.get(num);
        }
        long sum = fib(num-1, memo) + fib(num-2, memo);
        fibList.add(sum);
        memo.put(num, sum);
        return sum;
    }	
    
    public static void main(String[] args)
    {
    	System.out.println(fibIteratively(10)); //55
    }
    public static long fibIteratively(int num)
    {
    	long currNum = 1L;
    	if(num == 0) { return 0L;}
    	if(num == 1) {return 1L;}
    	
    	long lastNum = 1;
    	long secondLastNum = 0;
    	for(int inx = 2; inx <= num; inx++)
    	{
    		currNum = lastNum + secondLastNum;
    		secondLastNum = lastNum;
    		lastNum = currNum;
    	}
    	return currNum;
    }
}
