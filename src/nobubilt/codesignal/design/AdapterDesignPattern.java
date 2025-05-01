package nobubilt.codesignal.design;

public class AdapterDesignPattern {

	  public static void main(String[] args) {
	        // Existing music player
	        MusicPlayer legacyPlayer = new MusicPlayer();
	        legacyPlayer.play("song.mp3");  // Directly supported

	        // Adapter-enhanced player
	        MusicPlayerAdapter adapterPlayer = new MusicPlayerAdapter(legacyPlayer);
	        adapterPlayer.play("song.wav");  // Supported through adapter
	    }
	/**
	 * The Adapter pattern is our bridge for making otherwise incompatible interfaces work together, 
	 * similar to how a travel adapter allows devices from one country to be used in the electrical 
	 * outlets of another. For a more streamlined example, imagine a simple scenario where we have 
	 * a legacy MusicPlayer designed to play MP3 files alone, and we're looking to support more 
	 * formats like WAV without changing its interface.
	 * 
	 * In this example, the MusicPlayerAdapter wraps the MusicPlayer, allowing it to play WAV files 
	 * by converting them to the MP3 format it supports. This demonstrates the Adapter pattern's 
	 * core idea: facilitating backward compatibility by enabling a new feature (WAV support) 
	 * without altering the original music player's code. It's a seamless way to extend functionality 
	 * while preserving the old system's integrity.
	 */
}

class MusicPlayer {
    public void play(String file) {
        if (file.endsWith(".mp3")) {
            System.out.println("Playing " + file + " as mp3.");
        } else {
            System.out.println("File format not supported.");
        }
    }
}

class MusicPlayerAdapter {
    private MusicPlayer player;

    public MusicPlayerAdapter(MusicPlayer player) {
        this.player = player;
    }

    public void play(String file) {
        if (file.endsWith(".wav")) {
            // Convert WAV file playback request into MP3 format request
            String convertedFile = file.replace(".wav", ".mp3");
            System.out.println("Converting " + file + " to " + convertedFile + " ...");
            player.play(convertedFile);
        } else {
            player.play(file);
        }
    }
}
