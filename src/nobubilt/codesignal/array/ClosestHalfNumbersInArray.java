package nobubilt.codesignal.array;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestHalfNumbersInArray {

	public static int[] solution(int[] X, int[] Y) {

        // TODO: implement
        List<SimpleEntry<Integer, Integer>> x_sorted = new ArrayList<>(); 
        for(int inx = 0; inx < X.length; inx++)
        {
            x_sorted.add(new SimpleEntry<>(X[inx], inx));
        }
        x_sorted.sort(Comparator.comparingInt(SimpleEntry::getKey));
        int[] result = new int[Y.length];
        for(int yIndex = 0; yIndex < Y.length; yIndex++)
        {
            int half = Y[yIndex]/2;
            int closestxIndex = 0;
            int leftInx = 0;
            int rightInx = x_sorted.size()-1;
            while(leftInx <= rightInx)
            {
                int middleInx = (leftInx + rightInx)/2;
                int middleNum = x_sorted.get(middleInx).getKey();
                if(half == middleNum)
                {
                    closestxIndex = middleInx;
                    break;
                }
                 else if( middleNum < half )
                {
                    leftInx= middleInx +1;
                }
                else 
                {
                    rightInx = middleInx-1;
                }
            }
            if (leftInx < x_sorted.size() && Math.abs(x_sorted.get(leftInx).getKey()-half) < Math.abs(x_sorted.get(closestxIndex).getKey() - half))
            {
                closestxIndex = leftInx;
            }
             if (rightInx >= 0 && Math.abs(x_sorted.get(rightInx).getKey()-half) < Math.abs(x_sorted.get(closestxIndex).getKey() - half))
            {
                closestxIndex = rightInx;
            }
            result[yIndex] = Y[x_sorted.get(closestxIndex).getValue()];
        }
        return result;
    }
}
