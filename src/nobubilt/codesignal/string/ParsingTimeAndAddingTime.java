package nobubilt.codesignal.string;

public class ParsingTimeAndAddingTime {	

    public static void main(String[] args) {
        // Call the function
        System.out.println(addSeconds("23:58:30", 123)); // 00:00:33
    }
/**
 * Here, %02d ensures that each time unit (hours, minutes, and seconds) will be at
 *  least 2 characters wide, padding with 0 if necessary.
 * @param time
 * @param secondsToAdd
 * @return
 */
 	 public static String addSeconds(String time, int secondsToAdd) {
	        String[] timeParts = time.split(":");
	        int hours = Integer.parseInt(timeParts[0]);
	        int minutes = Integer.parseInt(timeParts[1]);
	        int seconds = Integer.parseInt(timeParts[2]);
/**
 * Now we need to add the integer representing the number of seconds to our computed 
 * secondsSinceStart and also consider cases where the added seconds roll over into 
 * the next day:
 * The modulus operator % ensures that our totalSeconds value doesn't exceed the 
 * total number of seconds in a day (86400 seconds or 24⋅3600 seconds).
 */
	        int secondsSinceStart = hours * 3600 + minutes * 60 + seconds;
	        System.out.println("secondsSinceStart: " + secondsSinceStart);
	        System.out.println("secondsSinceStart + secondsToAdd: " + (secondsSinceStart + secondsToAdd));
	        int totalSeconds = (secondsSinceStart + secondsToAdd) % (24 * 3600);
	        System.out.println("totalSeconds: " + totalSeconds);

	        int newHours = totalSeconds / 3600;
	        totalSeconds %= 3600;
	        int newMinutes = totalSeconds / 60;
	        int newSeconds = totalSeconds % 60;

	        return String.format("%02d:%02d:%02d", newHours, newMinutes, newSeconds);
	    }

	  
}
