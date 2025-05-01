package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RecursionGeneratingBalancedParenthesis {
/**
 * Given an integer n, your task is to return a list of strings with all the possible 
 * combinations of n pairs of parentheses that are correct. A correct combination 
 * of parentheses is one where every opening bracket has a corresponding closing bracket. 
 * You should use a recursive approach to solve this problem.

For example, given n = 3, the possible combinations would be 
["((()))", "(()())", "(())()", "()(())", "()()()"].
 * @param n
 * @return
 */

	   public static List<String> generateParentheses(int n) {
	        // TODO: implement the function
	        List<String> combinations = new ArrayList<>();
	        if(n == 0){return combinations;}
	        Stack<Character> stack = new Stack<>();
	        generateParentheses(2*n, 0, stack, combinations);
	        return combinations;
	    }
	    /**

	 * Output for 3: ((()))
			   		 (()())
                     (())()
               		 ()(())
               		 ()()()
               		 
        Output for 2: (())()()
        Output for 1: ()

 * When you build a parentheses tree, where root is 2n, the root.left leaf 
	 * means we have 2n-1 parentheses to construct plus a diff + 1 
	 * when we add ( in comparison to the right which we havent constructed. 
	 * When u construct the right 
	 * then its 2n-1 parentheses to construct and  diff -1=> even out.
	 * Time: O(N* 2 TO THE POWER N)
	 * Space: O(N* 2 TO THE POWER N)
	 * @param n
	 * @param diff - difference between the number of open and closed parantheses
	 * @param stack
	 * @param combinations

	     */
	      public static List<String> generateParentheses(int n, int diff, 
	    		  Stack<Character> stack , 
	    		  List<String> combinations)
	      {// if diff > n it means we don't have enough parentheses to close the 
	    	  //open parentheses
	         if(diff < 0 || diff > n)
	         {
	            return combinations;
	         }
	         else if(n == 0)// we have gone thru all combinations
	         {
	            if(diff == 0)// make sure diff is zero
	            {
	                combinations.add(concatenate(stack));
	                return combinations;
	            }
	         }
	         else
	         {
	        	stack.add('(');
	        	  // 1 less parentheses to add and now there is a diff of +1
	        	generateParentheses(n-1, diff+1, stack, combinations);
	 			stack.pop();     // remove the open 1 to add closing one
	 			stack.add(')');
	 	 // its diff minus 1 because we subtract 1 when we add a closing parentheses.
	 			//Check tree
	 			generateParentheses(n-1, diff-1, stack, combinations);
	 			// remove the parentheses we added to backtrack to the previous code.
	 			stack.pop();
	         }
	         return combinations;
	      }
	      
	      protected static String concatenate(Stack<Character> stack)
	      {
	          StringBuilder sb = new StringBuilder();
	          List<Character> result = new ArrayList<>();
	          result.addAll(stack);
	          for(int inx = 0; inx < result.size(); inx++)
	          {
	            sb.append(result.get(inx));
	          }
	          return sb.toString();
	      }
	}
