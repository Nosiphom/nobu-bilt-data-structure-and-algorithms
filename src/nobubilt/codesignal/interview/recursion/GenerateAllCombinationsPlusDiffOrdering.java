package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenerateAllCombinationsPlusDiffOrdering {
	
	/**
	 * Given a string s of n characters, your task is to write a Java function called 
	 * allCombinations that uses a recursive algorithm to generate and return a list 
	 * of all possible combinations of the characters in the string, including the 
	 * original string and its reverse. The combinations should be sorted in alphabetical order.
	For instance, if the input is 'abc', the function should return a list of all possible 
	combinations: ['a', 'ab', 'abc', 'ac', 'acb', 'b', 'ba', 'bac', 'bc', 'bca', 'c',
	 'ca', 'cab', 'cb', 'cba'].
	 * 
	 *
	 */
	   public static List<String> allCombinations(String s) {
        // TODO: implement the function
        Set<String> uniqueSet = new HashSet<>();
        char[] arr = s.toCharArray();
        if(arr.length == 1)
        {
        	uniqueSet.add(s);
            return new ArrayList<>(uniqueSet);
        }
        Arrays.sort(arr);
        List<Character> elements = new ArrayList<>();
        for(int inx =0; inx < arr.length; inx++)
        {
            elements.add(arr[inx]);
        }
        Set<List<Character>> comboList = new HashSet<>();
        buildCombinations(elements, uniqueSet, comboList);
        List<String> outcome = new ArrayList<>(uniqueSet);
        Collections.sort(outcome);
        return outcome;
    }
    
    public static Set<List<Character>> buildCombinations(List<Character> elements, 
    		Set<String> uniqueSet, Set<List<Character>> comboList)
    {
        if(elements.isEmpty())
        {
            comboList.add(new ArrayList<>());
            return comboList;
        }
        if(elements.size() > 0)
        {
           Character firstChar = elements.get(0);
           elements.remove(0);
           
           Set<List<Character>> reducedCharacterList = buildCombinations(elements, uniqueSet, comboList);
           Set<List<Character>> inclusiveCharacterList = new HashSet<>();
           Set<String> inclusivePhrases = new HashSet<>();
           
           for(List<Character> characterListWithout : reducedCharacterList)
           {
                List<Character> combiningCombo = new ArrayList<>(characterListWithout);
                combiningCombo.add(firstChar);
                
                inclusiveCharacterList.add(combiningCombo);
                String phrase = combiningCombo.stream().map(String::valueOf).collect(Collectors.joining());
                inclusivePhrases.add(phrase);
                Set<List<Character>> swapOutcome = new HashSet<>();
                if(combiningCombo.size() > 1)
                {
                    // swap characters
                    buildPermutations(new ArrayList<>(combiningCombo), 0, swapOutcome);
                }
                //
                inclusiveCharacterList.addAll(swapOutcome);
                for(List<Character> swapCharacterList : swapOutcome)
                {
                    phrase = swapCharacterList.stream().map(String::valueOf).collect(Collectors.joining());
                    inclusivePhrases.add(phrase);                    
                }
           }
           uniqueSet.addAll(inclusivePhrases);
           comboList.addAll(inclusiveCharacterList);
        }
        return comboList;
    }
    
    public static void buildPermutations(List<Character> elements, int first, Set<List<Character>> swapOutcome)
    {
       if(first == elements.size())
       {
        swapOutcome.add(new ArrayList<>(elements));
        return;
       }   
       for(int inx = first; inx < elements.size(); inx++)
       {
          swap(elements, first, inx);
          buildPermutations(elements, first+1, swapOutcome);
          swap(elements, first, inx);        
       }
    }
    
    public static void swap(List<Character> elements, int left, int right)
    {
        Character leftTemp = elements.get(left);
        Character rightTemp = elements.get(right);
        elements.set(left, rightTemp);
        elements.set(right, leftTemp);
    }
}

