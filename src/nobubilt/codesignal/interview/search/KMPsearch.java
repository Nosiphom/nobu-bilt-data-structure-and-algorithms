package nobubilt.codesignal.interview.search;

import java.util.Arrays;

public class KMPsearch {
/**
 * Consider the KMP string searching algorithm, where the essence of its design is to 
 * eliminate the need to backtrack by retaining the information elicited from previous 
 * comparisons. If, at some point in the pattern, there's a mismatch, the algorithm 
 * does not begin matching the pattern with the text from the start but from a 
 * pre-computed point that takes into account all previous comparisons. It's an 
 * efficient way to avoid redoing work! LPS stands for "Longest Prefix which is 
 * also Suffix." In the KMP algorithm, the LPS array helps determine the next positions
 *  to match in the pattern, avoiding unnecessary comparisons. It's a key part of the 
 *  algorithm's efficiency.
 * @param text
 * @param pattern
 * @return
 */
    public static int kmpSearchT(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        int txtInx = 0;  // index for text
        int pattInx = 0;  // index for pattern
        
        while (txtInx < text.length()) {
            if (pattern.charAt(pattInx) == text.charAt(txtInx)) {
            	txtInx++;
            	pattInx++;
            }
            if (pattInx == pattern.length()) {
                return txtInx - pattInx;
            } else if (txtInx < text.length() 
            		&& pattern.charAt(pattInx) != text.charAt(txtInx)) {
                if (pattInx != 0) {
                	pattInx = lps[pattInx - 1];
                } else {
                	txtInx++;
                }
            }
        }
        return -1;
    }
/**
 * i 1
 * inx       012345
 *           abcaby
 * ev length           
 * lps       000120 
 * length      
 * @param pattern
 * @return
 */
	    private static int[] computeLPSArray(String pattern) {
	        int left = 0;
	        int right = 1;
	        int[] lps = new int[pattern.length()];
	        lps[0] = 0;

	        while (right < pattern.length()) {
	            if (pattern.charAt(right) == pattern.charAt(left)) {
	            	left++;
	                lps[right] = left;
	                right++;
	            } else {
	                if (left != 0) {
	                	left = lps[left - 1];
	                } else {
	                    lps[right] = 0;
	                    right++;
	                }
	            }
	        }
	        System.out.println("lps: ");
	        Arrays.stream(lps).forEach(rec-> System.out.print(rec + " "));
	        System.out.println();
	        return lps;
	    }

	   
	}

