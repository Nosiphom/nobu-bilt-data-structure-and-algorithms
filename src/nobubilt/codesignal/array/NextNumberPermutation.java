package nobubilt.codesignal.array;

public class NextNumberPermutation {

	public static int[] nextPermutation(int[] arr)
	{
		int pivot = arr.length-1;
		while(pivot >= 1 && arr[pivot] <= arr[pivot -1])
		{
			--pivot;
		}// pivot is at index where val is 9
		if(pivot != 0)// og 1,2,4,9,8,7,6,5,3
		{
			int index = arr.length-1;
			while(arr[index] <= arr[pivot -1])
			{
				--index;
			}// 4 for 5	=> 1,2,5,9,8,7,6,4,3		
			swap(arr, pivot-1, index);
			
			int left = pivot; //at index 3 where value 9 exists
			int right = arr.length - 1;//at index 8 where value 3 exists
			while(left < right)
			{
				swap(arr, left, right);
				++left;
				--right;
			}
			/**
			 * swap() occurrence
			 * //=> 1,2,5,9,8,7,6,4,3 => 9 for 3 => 1,2,5,3,8,7,6,4,9
			 * //=> 8 for 4 =>1,2,5,3,4,7,6,8,9=> 7 for 6 =>1,2,5,3,4,6,7,8,9
			 */
		}
		return arr;
	}
	
	public static void swap(int[] arr, int left, int right)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println();
		int[] arr = {1,2,4,9,8,7,6,5,3}; //next number in line
		//result2 =    1 2 5 3 4 6 7 8 9
		int[] result2 = nextPermutation(arr);
		
		for(int rec: result2)
		{
			System.out.print(rec + " ");
		}
		System.out.println();
		int[] nums = {1,2,3};
		
		int[] result = nextPermutation(nums); // 1 3 2
		
		for(int rec: result)
		{
			System.out.print(rec + " ");
		}
		

	}
}
