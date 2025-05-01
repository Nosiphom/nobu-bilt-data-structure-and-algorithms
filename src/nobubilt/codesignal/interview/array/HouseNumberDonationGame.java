package nobubilt.codesignal.interview.array;

import java.util.Arrays;

public class HouseNumberDonationGame {
    public static int[] houseGame(int[] houses) {
    	   // TODO: Implement
       int round = 0;
        
        String[] strArr = new String[houses.length];
        for(int inx=0; inx < houses.length; inx++)
        {
           strArr[inx] = String.valueOf(houses[inx]);
        }
        
       while(true)
       {       
           String[] clonedHouses = Arrays.copyOf(strArr, strArr.length);
           int len = clonedHouses.length;
           for(int inx = 0; inx < clonedHouses.length; inx++)
           {
               String leftNumStr = String.valueOf(clonedHouses[inx]);
               String rightNumStr = String.valueOf(clonedHouses[(inx+1)%len]);
              System.out.println("Str: " +  leftNumStr + " " + rightNumStr);
               if(leftNumStr.length()-1-round >= 0 && leftNumStr.length()-1-round  < leftNumStr.length())
               {
                   char leftNumChar = leftNumStr.charAt(leftNumStr.length()-1-round); 
         //          System.out.println(" leftNumChar " + leftNumChar);  
                   StringBuilder sbLeft  = new StringBuilder();
                   sbLeft.append(leftNumChar);
                   sbLeft.append(rightNumStr);
                   clonedHouses[(inx+1)%len] = sbLeft.toString();
                   String leftOverLeft = leftNumStr.substring(0, leftNumStr.length()-1-round);
                   String leftOverRightOfLeft = leftNumStr.length()-round < leftNumStr.length() ? leftNumStr.substring(leftNumStr.length()-round) : "";
                   String leftStr = leftOverLeft + leftOverRightOfLeft;
                  System.out.println("leftOverLeft: " + leftOverLeft + " leftOverRightOfLeft:  " + leftOverRightOfLeft +" leftStr: " + leftStr + 
                   " clonedHouses[(inx+1)%len]: "+ clonedHouses[(inx+1)%len] 
                  + " leftNumChar: " + leftNumChar + " rightNumStr: " + rightNumStr  );   
                   /**
                      Assertions.assertArrayEquals(new int[]{15, 156, 123}, app.houseGame(new int[]{155, 261, 31}));
                   15 5261 31=> 15 526 131 => 115 526 13 => 
                   
                   clonedHouses: 115 156 23
                   
                   15 156 231
                   */
                   clonedHouses[inx] = leftStr;
               }
               System.out.println();
        //       System.out.print("Round" + round+ " " +clonedHouses[inx] + " " +clonedHouses[(inx+1)%len] + " ");
           }
            System.out.println();
           System.out.println("clonedHouses:");
           for(int inx = 0; inx < clonedHouses.length; inx++)
           {
               System.out.print(clonedHouses[inx] + " ");
           }
           System.out.println();
             System.out.println("strArr:");
           for(int inx = 0; inx < strArr.length; inx++)
           {
               System.out.print(strArr[inx] + " ");
           }
           // Arrays.stream(clonedHouses).forEach(rec-> System.out.print(rec + " ") ); 
           // 
           if(Arrays.equals(strArr, clonedHouses)){break;}
           strArr = clonedHouses;
          
           System.out.println();
           ++round;
       }
        for(int inx=0; inx < strArr.length; inx++)
        {
           houses[inx] = Integer.parseInt(strArr[inx]);
        }
       // TODO: Implement
       return houses;

    }
    
    public static void main(String[] args)
    {
    	int[] houses = {155, 52, 154, 4};
    	int[] result = houseGame(houses);
    	
    	Arrays.stream(result).forEach(rec-> System.out.print(rec + " ") );
    }
}
