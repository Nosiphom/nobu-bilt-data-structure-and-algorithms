package nobubilt.codesignal.concurrency.collections.skiplist;

public class LeaderBoardTest {

	  public static void main(String[] args) throws InterruptedException {
	        LeaderBoard leaderboard = new LeaderBoard();

	        // Thread 1 - Adding scores for group 1 of players
	        Thread t1 = new Thread(() -> {
	            leaderboard.addScore("Alice", 1900);
	            leaderboard.addScore("Bob", 1200);
	            leaderboard.addScore("Luke", 900);
	            leaderboard.addScore("Jake", 100);
	            leaderboard.addScore("Rick", 400);
	            leaderboard.addScore("Gumbo", 500);
	            leaderboard.addScore("Todd", 600);
	            leaderboard.addScore("Saul", 800);

	            
	        });

	        // Thread 2 - Adding scores for group 2 of players
	        Thread t2 = new Thread(() -> {
	            leaderboard.addScore("Charlie", 1800);
	            leaderboard.addScore("Diana", 1600);
	        });

	        // Thread 3 - Updating existing scores
	        Thread t3 = new Thread(() -> {
	            leaderboard.addScore("Brr", 100);
	            leaderboard.addScore("Kal", 400);
	            leaderboard.addScore("Harry", 500);
	            leaderboard.addScore("Wendy", 600);
	            leaderboard.addScore("Denver", 800);
	            leaderboard.addScore("Alice", 1500);
	            leaderboard.addScore("Eve", 1700);
	        });

	        t1.start();
	        t2.start();
	        t3.start();

	        t1.join();
	        t2.join();
	        t3.join();
	        // TODO: Test the removePlayer method to ensure it works correctly
	        leaderboard.removePlayer("Charlie");
	        System.out.println("Top 3 players: " + leaderboard.getTopNPlayers(3));
	       
	        System.out.println("Score for player Bob: " + leaderboard.getScore("Bob"));
	  
	  }
	}
