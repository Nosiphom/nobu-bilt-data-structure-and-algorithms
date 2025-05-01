package nobubilt.codesignal.concurrency.collections.hashandlist;

public class PlaylistManagerConcurrentListTest {
	 public static void main(String[] args) throws InterruptedException {
		 PlaylistManagerConcurrentList playlistManager = new PlaylistManagerConcurrentList();

	        // TODO: Create a thread to add songs to the playlist.
	        Thread addThread = new Thread(()-> {
	            playlistManager.addSong("Say what you will");
	            playlistManager.addSong("Summer rain");
	            playlistManager.addSong("Winter Blues");
	            playlistManager.addSong("Blanco White");
	            playlistManager.addSong("High");
	            playlistManager.addSong("We Good");
	            playlistManager.addSong("Fell a little too hard");
	            playlistManager.addSong("Money up");
	            playlistManager.addSong("Im bad");
	            playlistManager.addSong("Vixen");
	            playlistManager.addSong("Purple rain");
	            playlistManager.addSong("We are");
	            playlistManager.addSong("Praying");
	            playlistManager.addSong("Running");
	            playlistManager.addSong("Tooo fast");
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
