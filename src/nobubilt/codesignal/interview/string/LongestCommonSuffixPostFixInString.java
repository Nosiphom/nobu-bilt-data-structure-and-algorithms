package nobubilt.codesignal.interview.string;

public class LongestCommonSuffixPostFixInString {
	   public static String solution(String[] strs) {
		   if(strs.length == 0) {return "";}
		   String shortestStr = strs[0];
		   for(String phrase : strs)
		   {
			   if(phrase.length() < shortestStr.length())
			   {
				   shortestStr = phrase;
			   }
		   }

		   for(String phrase : strs)
		   {
			   int shortestStrsInx = shortestStr.length()-1;
			   for(int inx = phrase.length()-1; inx >= 0 && shortestStrsInx >= 0; inx--, shortestStrsInx--)
			   {
				   if(phrase.charAt(inx) != shortestStr.charAt(shortestStrsInx))
				   {
					   return shortestStr.substring(shortestStrsInx+1);
				   }
			   }
		   }
		  return shortestStr;
	   }
	/**
	 * You are given an array of n strings. Your task is to find the longest common suffix
	 *  shared among all strings in the array. A suffix is a sequence of letters at the end 
	 *  of a word. For instance, in the word "flying," "ing" is a suffix.

	If the given array is empty or there is no common suffix among the strings, your function
	 should return an empty string.

	For example, given an array of strings: ["barking", "parking", "starking"], the longest 
	common suffix is "arking".
	 * 
	 *
	 */	

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   public static String solutiont(String[] strs) {
	        // TODO: Implement the function
	        if(strs.length == 0){return "";}
	        String shortestString = strs[0];
	        for(String phrase : strs)
	        {
	            if(phrase.length() < shortestString.length())
	            {
	                shortestString = phrase;
	            }
	        }
	        
	            for(String phrase : strs)
	            {
	                if(!phrase.equals(shortestString))
	                {
	                    System.out.println("phrase: "+ phrase + " shortestString: "+ shortestString);
	                    int shortestStringInx = shortestString.length()-1;
	                    int phraseLen = phrase.length();
	                    for(int inx = phraseLen -1; inx >= 0 && shortestStringInx >= 0; inx-- )
	                    {
	                        if(phrase.charAt(inx) != shortestString.charAt(shortestStringInx))
	                        {
	                            return shortestString.substring(shortestStringInx+1);
	                        }
	                       
	                        shortestStringInx--;
	                    }    
	                }
	                
	            }
	        
	        return shortestString;
	    }
	}
