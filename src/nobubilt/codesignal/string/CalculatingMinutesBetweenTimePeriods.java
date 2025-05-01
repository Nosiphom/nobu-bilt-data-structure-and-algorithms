package nobubilt.codesignal.string;

public class CalculatingMinutesBetweenTimePeriods {
	
	   public int timePeriodLength(String timePeriod) {
		   String[] arr = timePeriod.split(" - ");
		   String startTs[] = arr[0].split(":");
		   String endTs[] = arr[1].split(":");
		   
		   String startHr = startTs[0];
		   String startMin = startTs[1];
		   String startSec = startTs[2];
		   
		   String endHr = endTs[0];
		   String endMin = endTs[1];
		   String endSec = endTs[2];
		   
		   int startTimeInSeconds = (Integer.parseInt(startHr) * 3600) + 
				   (Integer.parseInt(startMin) * 60) + Integer.parseInt(startSec);
		   int endTimeInSeconds = (Integer.parseInt(endHr) * 3600) + 
				   (Integer.parseInt(endMin) * 60) +  Integer.parseInt(endSec);
		   
		   int deltaInSeconds = endTimeInSeconds - startTimeInSeconds;
		   int diffInMin = deltaInSeconds/60;
		   if(!startSec.equals("00") && endSec.equals("00"))
		   {
			   ++diffInMin; // Add 1 if there were extra seconds
		   }
		   return diffInMin;
	   }
/**
 * You are given a time period formatted as a string in the HH:MM:SS - HH:MM:SS format. 
 * HH:MM:SS represents the time in hours, minutes, and seconds form, and the hyphen (-) 
 * separates the start time from the end time of the period.

Your task is to calculate how many minutes pass from the start time until the end time.

Here are some guidelines:

The input times are always valid time strings in the HH:MM:SS format, with HH ranging 
from 00 to 23, and MM and SS from 00 to 59. The output should be an integer, 
representing the total length of the time period in minutes.
The start time of the period will always be earlier than the end time, so periods that
 cross over midnight (like 23:00:00 - 01:00:00) are not considered.
We are interested in the number of times the time passes some HH:MM:00 after the start
 time until the end time. Any remaining seconds should be disregarded; for instance, a 
 period of "12:15:00 - 12:16:59" represents 1 minute, not 2, and a period of
  "12:14:59 - 12:15:00" also represents 1 minute.
Your function should look like this:

Java
public int timePeriodLength(String timePeriod);
Where timePeriod is a string formatted as HH:MM:SS - HH:MM:SS. The function should 
return a single integer that represents the total length of the specified time period 
in minutes.

Example:

Java
timePeriodLength("12:15:30 - 14:00:00");
// should return 105
 */
	
}
