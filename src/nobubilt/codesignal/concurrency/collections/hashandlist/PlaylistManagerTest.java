package nobubilt.codesignal.concurrency.collections.hashandlist;
/**
 * In this task, you'll implement a PlaylistManager class that manages a 
 * playlist of songs (strings) where multiple threads can concurrently 
 * add and remove songs. The playlist should be a synchronized list, 
 * ensuring thread safety and data integrity. The class should provide 
 * thread-safe methods for adding songs to the playlist and removing 
 * songs after they are played.

You'll need to:

Use Collections.synchronizedList() to create the playlist.
Implement methods to safely add and remove songs.
Ensure that multiple threads can modify the playlist concurrently 
without causing data corruption.
 * 
 *
 */
public class PlaylistManagerTest {
	 public static void main(String[] args) throws InterruptedException {
	        PlaylistManager playlistManager = new PlaylistManager();

	        // TODO: Create a thread to add songs to the playlist.
	        Thread addThread = new Thread(()-> {
	            playlistManager.addSong("Say what you will");
	            playlistManager.addSong("Summer rain");
	            playlistManager.addSong("Winter Blues");
	            playlistManager.addSong("Blanco White");
	            playlistManager.addSong("High");
	            playlistManager.addSong("We Good");
	        });
	        
	        Thread addTaylorThread = new Thread(()-> {
	            playlistManager.addSong("Taylor: Bejeweled");
	            playlistManager.addSong("Taylor: Red ");
	            playlistManager.addSong("Taylor: Shake it off");
	            playlistManager.addSong("Taylor: Midnight");
	            playlistManager.addSong("Taylor: The Man");
	            playlistManager.addSong("Taylor: Ready for it");
	        });

	        // TODO: Create a thread to play and remove songs from the playlist.
	        Thread removeThread = new Thread(()-> {
	            playlistManager.removeSong("Blanco White");
	            playlistManager.removeSong("Taylor: Midnight");
	            playlistManager.removeSong("Green Day");
	            playlistManager.removeSong("Summer rain");
	        });

	        // TODO: Start both threads and join them.
	        addThread.start();
	        addTaylorThread.start();
	        removeThread.start();
	        
	        addThread.join();
	        addTaylorThread.join();
	        removeThread.join();

	        // Print remaining playlist
	        System.out.println("Remaining playlist: " + playlistManager.getPlaylist());
	    }
	}
