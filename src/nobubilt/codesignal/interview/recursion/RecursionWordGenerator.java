package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RecursionWordGenerator {
	
/**
 * As part of the team of software engineers at XYZ Corp, you're working on a new word game.
 * The game takes an array of n strings, where each string contains m characters. Your 
 * task is to design a Java program that returns all combinations of the characters in 
 * the strings by taking one character from each string to form a unique word. Words 
 * should be returned in alphabetical order. Use a recursive approach to solve this problem.

Return a list of all the new words.

For example, for words = {"abc", "def", "ghi"}, the output should be 
{"adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", 
"beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", 
"cfg", "cfh", "cfi"}.
 */

    public static List<String> solution(String[] words) {
        // TODO: implement solution
        
        Set<String> subset = new HashSet<>();
        List<Character> elements = new ArrayList<>();
        generate(words, 0, elements, subset);
        List<String> result = new ArrayList<>(subset);
        Collections.sort(result);
        return result;
    }
    
    public static void generate(String[] words, int first, List<Character> elements, 
    		Set<String> subset)
    {
        if(elements.size() == words.length)
        {
            String phrase = elements.stream().map(String::valueOf).collect(
            		Collectors.joining());
            subset.add(phrase);
            return;
        }
                
        String word = words[first];
        for(int wordInx = 0; wordInx < word.length(); wordInx++)
        {
            elements.add(word.charAt(wordInx));
            generate(words, first +1, elements, subset);
            elements.remove(elements.size()-1);
        }   
    }
	
}
