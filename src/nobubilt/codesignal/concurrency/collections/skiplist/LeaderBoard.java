package nobubilt.codesignal.concurrency.collections.skiplist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class LeaderBoard {

	// Map scores to players, with scores in reverse order (highest first)
    private final ConcurrentSkipListMap<Double, Set<String>> scoreMap =
            new ConcurrentSkipListMap<>(Collections.reverseOrder());
    // Map players to their current scores
    private final ConcurrentHashMap<String, Double> playerScores = new ConcurrentHashMap<>();

    // Add or update a player's score
    public void addScore(String player, double score) {
        Double oldScore = playerScores.put(player, score);
        if (oldScore != null) {
            // Remove player from old score set
            scoreMap.computeIfPresent(oldScore, (k, v) -> {
                v.remove(player);
                return v.isEmpty() ? null : v;
            });
        }
        // Add player to new score set
        scoreMap.compute(score, (k, v) -> {
        	// Use ConcurrentSkipListSet for concurrent modifications
            if (v == null) v = new ConcurrentSkipListSet<>(); 
            v.add(player);
            return v;
        });
    }

    // Get the top n players
    public List<String> getTopNPlayers(int n) {
        List<String> topPlayers = new ArrayList<>();
        for (Map.Entry<Double, Set<String>> entry : scoreMap.entrySet()) {
            for (String player : entry.getValue()) {
                topPlayers.add(player + " " + entry.getKey());
                if (topPlayers.size() == n) return topPlayers;
            }
        }
        return topPlayers;
    }
    
    // TODO: Implement a method called `removePlayer` that removes a player from the leaderboard
    public void removePlayer(String player)
    {
        Double oldScore = playerScores.remove(player);
        if(oldScore != null)
        {
            scoreMap.computeIfPresent(oldScore, (key, val)-> {
                if(!val.isEmpty())
                {
                    val.remove(player);
                }
                System.out.println("Removing player: " + player);
                return val.isEmpty() ? null : val;
            });
        }
    }
    
    // TODO: Implement the `getScore` method that searches for a player's score by name
    public double getScore(String player)
    {
        return playerScores.getOrDefault(player, null);
    }
}
