package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaylistManager {

	 private List<String> playlist = Collections.synchronizedList(new ArrayList<>());

	    // TODO: Implement a thread-safe method to add a song to the playlist.
	    public void addSong(String song)
	    {
	        synchronized(playlist)
	        {
	            playlist.add(song);
	            System.out.println("Adding song: " + song);
	        }
	    }
	    // TODO: Implement a thread-safe method to remove a song after it is played.
	    public boolean removeSong(String song)
	    {
	        synchronized(playlist)
	        {
	            if(playlist.contains(song))
	            {
	                playlist.remove(song);
	                System.out.println("Removed song: " + song);
	                return true;
	            }
	            System.out.println("Couldnt remove non-existent song: " + song);
	            return false;
	        }
	    }

	    // Method to get the current playlist
	    public List<String> getPlaylist() {
	        return playlist;
	    }
	}
