package nobubilt.codesignal.interview.bit;

public class Combs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comb1 =  "*..*.*"; // len 6
		String comb2 =  "*.***"; // len 5 
		System.out.println(solution(comb1, comb2)); //9	
	}

	static int solution(String comb1, String comb2) {
		comb1 = comb1.replace('*', '1').replace('.','0');
		comb2 = comb2.replace('*', '1').replace('.','0');
		
		int c1Num = Integer.parseInt(comb1, 2);
		int c2Num = Integer.parseInt(comb2, 2);
		int shift1 = 1;
		int shift2 = 1;
		int c1Len = comb1.length();
		int c2Len = comb2.length();
		
		while(((c1Num << shift1) & c2Num) != 0)
		{
			++shift1;
		}
		while(((c2Num << shift2) & c1Num) != 0)
		{
			++shift2;
		}		
		return Math.min(Math.max(c1Len + shift1, c2Len), Math.max(c1Len, c2Len + shift2));
	}
	
	/**
	 * c1 = 37 => 100101
	 * i = 3;
	 * 100101 << 3 = > 100101000
	 * c2 = 23 => 10111
	 * 100101000
	 *   & 10111
	 *=000000000
	 *
	 * 10111 << 6 => 10111000000
	 *  &                 100101
	 *  =>           00000000000
	 *  
	 *  max(6 + 3, 5), max(5+6, 6)
	 *  min(9, 11)
	 */
	

}
