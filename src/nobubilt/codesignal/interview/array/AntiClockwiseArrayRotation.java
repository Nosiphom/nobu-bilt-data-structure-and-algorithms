package nobubilt.codesignal.interview.array;

public class AntiClockwiseArrayRotation {

/**
 * You are provided with an array of n integers and a number k. Your task is to 
 * perform an anti-clockwise rotation (toward the front) of the array by k positions. 
 * The rotation should be done in place, which means you have to directly manipulate 
 * the input array without creating a new one. Note that k might be bigger than the 
 * array length.

For example, if the input array is [1, 2, 3, 4, 5, 6, 7], and k = 3, then after the 
operation, the input array should look like [4, 5, 6, 7, 1, 2, 3].
 
 7 6 5 4 3 2 1
 3 2 1flip
  7 6 5 4flip

 */
	public static void antiRotateArray(int[] nums, int k) {
        // TODO: Implement anti-clockwise rotation of the array nums by k steps.
        k = k%nums.length;
        // 7  6  5  4  3  2  1
        //    last k  1 2 3
        // 7  6  5  4  1  2  3
        // swap 1st size - k
        // 4  5  6  7  1  2  3
        reverse(nums, 0, nums.length-1);
        //reverse last k elements
        reverse(nums, nums.length - k, nums.length-1);
        //reverse 1st to prior k elements
        reverse(nums, 0, nums.length - k -1);
        
    }
     public static void reverse(int[] nums, int left, int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }
    }
   
}
