package nobubilt.codesignal.interview.recursion;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingCreatePermutations {

/**
 * Backtracking is a general algorithm for finding all (or some) solutions to some 
 * computational problems. In our example, we are recursively swapping all elements 
 * (for each index from the first to the last), moving one step further in the depth 
 * of the list after each recursion until we reach the end. Once we get there, we 
 * append the current state of the array to our results array.
 * @param args
 */

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private static void backtrack(int[] nums, int first, List<List<Integer>> result) {
        if (first == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
        }
        for (int i = first; i < nums.length; i++) {
            swap(nums, first, i); // Swap numbers
            backtrack(nums, first + 1, result);
            swap(nums, first, i); // Swap them back to reset the state
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
