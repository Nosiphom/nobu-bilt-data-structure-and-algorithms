package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PlaylistManagerConcurrentList {
	private Queue<String> queue = new ConcurrentLinkedQueue<>();
	
	public void addSong(String song)
	{
		queue.offer(song);
		System.out.println("Adding song: " + song);
	}
	
	public boolean removeSong(String song)
	{
		if(queue.contains(song))
		{
			queue.remove(song);
            System.out.println("Removed song: " + song);
            return true;
		}
        System.out.println("Couldnt remove non-existent song: " + song);
        return false;
	}
	
	 // Method to get the current playlist
    public List<String> getPlaylist() {
        return queue.stream().toList();
    }
}
