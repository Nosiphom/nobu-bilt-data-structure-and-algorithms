package nobubilt.codesignal.interview.array;


public class RotateArrayByKpositions {

/**
 * rotating an array by k positions
 * In this example, when k = 3, the algorithm first reverses the entire array, 
 * resulting in [7, 6, 5, 4, 3, 2, 1]. Then, it reverses the first k elements, 
 * giving us [5, 6, 7, 4, 3, 2, 1], and finally, reverses the rest of the array to
 *  get [5, 6, 7, 1, 2, 3, 4], achieving the desired rotation.
 * @param nums
 * @param k
 */
	    public static void rotateArray(int[] nums, int k) {
	        // Ensure k is within the bounds of the array length
	        k = k % nums.length; 
	        // Reverse the entire array
	        reverse(nums, 0, nums.length - 1);
	        // Reverse the first k elements
	        reverse(nums, 0, k - 1);
	        // Reverse the rest of the array
	        reverse(nums, k, nums.length - 1);
	    }

	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        rotateArray(nums, k);
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	        // Output: 5 6 7 1 2 3 4
	        
	        int[] arr = {1, 3, 5, 7, 9};
			int L = 2;
			rotateArray(arr, L);
	        for (int num : arr) {
	            System.out.print(num + " "); //7 9 1 3 5 
	        }
	    }
	
}
