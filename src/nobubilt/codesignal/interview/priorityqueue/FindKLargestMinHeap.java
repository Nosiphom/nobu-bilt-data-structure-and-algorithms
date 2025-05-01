package nobubilt.codesignal.interview.priorityqueue;

import java.util.PriorityQueue;


public class FindKLargestMinHeap {
	  /**
	   * find the n-th largest number in a list, using sorting can be costly. By 
	   * leveraging Java's PriorityQueue implementation, the heap data structure 
	   * lets us do this efficiently.

	  Java's PriorityQueue class, by default, implements a min-heap, meaning the
	   smallest element is given the highest priority.
	   * 
	   *
	   */
		public static PriorityQueue<Integer> findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        return new PriorityQueue<>(minHeap);
    }
}
