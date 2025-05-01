package nobubilt.codesignal.interview.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortIntegersByAbsoluteDiffFromMedian {
/**
 * You have to sort an array of n integers but with a twist. The task requires you to 
 * sort the integers according to their absolute difference from the median of the array. 
 * If two numbers have the same absolute difference from the median, the smaller number 
 * should be placed first.
 * To calculate the median of an array, you need to sort the array first.
 * If the array has an odd number of entries, the median is the middle element.
 * If the array has an even number of entries, the median is the average of the two middle elements. 
 * Specifically, sum these two middle elements and divide by 2.0 to ensure a floating-point result.
 * Make sure to use a heap to ensure efficient sorting, you are not allowed to use built-in methods 
 * like sort() or sorted().

 * The expected time complexity is O(nlogn).
     
     input = 1, 3, 5, 2, 4 => sorted = 1 2 3 4 5 but median is 3.
     3 vs 3 = 0 so its 1st
     2 has a diff of 1 for 3 
     4 has a diff of 1 for 3 
     1 has a diff of 2 for 3 
     5 has a diff of 2 for 3 
     
     result  {3, 2, 4, 1, 5}
 */

    public static int[] sortByMedian(int[] nums) {
        
        // TODO: implement solution
    	if(nums.length ==1){return nums;}
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int inx = 0;  inx < nums.length; inx++)
        {
            minHeap.add(nums[inx]);
        }
        int size = minHeap.size();
      
        for(int inx = 0; inx < size; inx++)
        {
            nums[inx] = minHeap.poll();
        }
        
        double middle = -1;
        if(size%2 != 0)
        {
            int midInx = size/2;
            middle = nums[midInx];
        }
        else
        {
            int rightMid = size/2;
            int leftMid = rightMid - 1;
            middle = (nums[leftMid] + nums[rightMid])/2.0;
        }
    //    System.out.println("middle: "+ middle);
        int[] result = new int[size];
        PriorityQueue<NumberByMedian>sortedMinHeap = new PriorityQueue<NumberByMedian>(new SortByMedian());
        for(int inx = 0; inx < size; inx++)
        {
            double delta = Math.abs(nums[inx] - middle);
            sortedMinHeap.add(new NumberByMedian(nums[inx], delta));
        }
        int inx = 0;
        while(!sortedMinHeap.isEmpty())
        {
            result[inx] = sortedMinHeap.poll().val;
            ++inx;
        }
        return result;
    }
}
class SortByMedian implements Comparator<NumberByMedian>
{
    public int compare(NumberByMedian num1, NumberByMedian num2)
    {
        if(num2.delta == num1.delta)
        {
            return num1.val - num2.val;
        }
        return (int) (num1.delta - num2.delta);
    }
}

class NumberByMedian 
{
    int val; 
    double delta;
    NumberByMedian(int v, double d)
    {
        this.val = v;
        this.delta =d;
    }
}

