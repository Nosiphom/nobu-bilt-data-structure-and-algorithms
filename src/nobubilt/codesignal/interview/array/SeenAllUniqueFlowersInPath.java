package nobubilt.codesignal.interview.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeenAllUniqueFlowersInPath {

    public int largestStep(int[] garden, int start, int direction) {
        // TODO: implement the function
        Set<Integer> uniqueFlow = new HashSet<>();
        for(int num : garden)
        {
            if(!uniqueFlow.contains(num))
            {
                uniqueFlow.add(num);
            }
        }
        
        if(garden.length == 1){return 1;}
        int optimalSeen = garden.length;
        int optimalJump = Integer.MIN_VALUE;
        int jump = 1;
        while((jump * direction) + start >= 0 && (jump * direction) + start < garden.length)
        {
            int position = start;
            List<Integer> seenInRound = new ArrayList<>();
            while(position >= 0 && position < garden.length)
            {
                seenInRound.add(garden[position]);
                position += (jump * direction);
            }
     
            if(seenInRound.containsAll(uniqueFlow))
            {

              if(seenInRound.size() < optimalSeen || (optimalJump == Integer.MIN_VALUE))
              {
                optimalSeen = seenInRound.size();
                optimalJump = jump;
              }
                
            }
            ++jump;
        }
        if(optimalJump == Integer.MIN_VALUE){return -1;}
        return optimalJump;
    }
    
}
