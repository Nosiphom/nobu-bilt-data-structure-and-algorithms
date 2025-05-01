package nobubilt.codesignal.concurrency.collections.skiplist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
/**
 * Your task is to write a real-time traffic congestion tracker from scratch. This system 
 * should use ConcurrentSkipListMap to manage congestion levels for different city streets, 
 * sorting them by congestion level and updating data thread-safely.

Ensure that:

ConcurrentSkipListMap stores street congestion levels, sorted in reverse order (highest congestion first).
Implement a method to update the congestion level for a specific street.
Implement a method to retrieve a list of the top N most congested streets.
 * 
 *
 */
public class TrafficCongestionTracker {

	   // TODO: Declare ConcurrentSkipListMap and ConcurrentHashMap to track congestion levels
    ConcurrentSkipListMap<Double, Set<String>> congestionLevels 
    = new ConcurrentSkipListMap<>(Collections.reverseOrder());
    ConcurrentHashMap<String, Double> streetToCongestionLevelMap = new ConcurrentHashMap<>();
    // TODO: Implement updateCongestion method to update the congestion level for a given street

    public void updateCongestion(String street, Double level)
    {
         
        Double oldLevel = streetToCongestionLevelMap.put(street, level);
        if(oldLevel != null)
        {
            congestionLevels.computeIfPresent(oldLevel, (key, val) ->{
                val.remove(street);
                return val.isEmpty() ? null : val;
            });
        }
        congestionLevels.compute(level, (key, val)->{
            if(val == null)
            {  
                val = new HashSet<>();
            }
            val.add(street);
            return val;
        });
    }
    // TODO: Implement getTopNCongestedStreets method to retrieve the top N most congested streets
    public List<String> getTopNCongestedStreets(int topN)
    {
        List<String> topCongestStreets = new ArrayList<>();
        for(Map.Entry<Double, Set<String>> entry : congestionLevels.entrySet())
        {
            for(String street : entry.getValue())
            {
                topCongestStreets.add(street + "  "+ entry.getKey());
                if(topCongestStreets.size() == topN)
                {
                    return topCongestStreets;
                }
            }
        }
        return null;
    }
}
