package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSchoolScores {

	/**
	 * There is a school hosting an online programming competition. Each problem is 
	 * assigned a unique level of difficulty. Every time a student successfully solves 
	 * a problem, their score is updated based on the problem's difficulty level. 
	 * However, if a student makes an unsuccessful attempt, they incur a penalty. 
	 * The competition logs every action of each student in a string.

Your task is to create a Java function named analyzeCompetition(). It will take a 
string of logs as input and output a list of arrays, representing the students' score, 
the number of successful attempts, and the total penalties. The arrays should be sorted
 by the decreasing order of scores of their respective students. It is guaranteed that 
 there will be no students with the same positive score. Don't include students in the 
 output who haven't solved any problem.

For example, if you have logs like this:
"1 solve 09:00 50, 2 solve 10:00 60, 1 fail 11:00, 3 solve 13:00 40, 2 fail 14:00, 
3 solve 15:00 70",
your function should return: [[3, 110, 2, 0], [2, 60, 1, 1], [1, 50, 1, 1]].

All log entries are separated by a comma and a space. It is guaranteed that the log 
entries are sorted in chronological order.
	 */
	
	 public List<int[]> analyzeCompetition(String logs) {
	        // TODO: implement the function
	        String[] logEntries = logs.split(", ");
	        Map<String, Student> studentMap = new HashMap<>();
	        for(String phrase: logEntries)
	        {
	            String[] entities = phrase.split(" ");
	            String id = entities[0];
	            String status = entities[1];
	            if(!studentMap.containsKey(id))
	            {
	                if(status.equals("fail"))
	                {
	                studentMap.put(id, new Student(id, 0, 0, 1));                    
	                }
	                else if(status.equals("solve"))
	                {
	                    studentMap.put(id, new Student(id, Integer.parseInt(entities[3]), 1, 0)); 
	                }
	            }
	            else
	            {
	                Student curr = studentMap.get(id);
	                if(status.equals("fail"))
	                {
	                studentMap.put(id, new Student(id, curr.totalScore, curr.successfulAttempts, curr.totalPenalties + 1));                    
	                }
	                else if(status.equals("solve"))
	                {
	                    studentMap.put(id, new Student(id, Integer.parseInt(entities[3])+ curr.totalScore, curr.successfulAttempts+ 1, curr.totalPenalties)); 
	                }
	            }
	            
	        }
	        List<int[]> result = new ArrayList<>();
	        for(String key : studentMap.keySet())
	        {
	            Student rec = studentMap.get(key);
	            int[] row = new int[]{Integer.parseInt(rec.studentId), rec.totalScore, rec.successfulAttempts, rec.totalPenalties};
	            result.add(row);
	        }
	        Collections.sort(result, Comparator.comparing(rec -> -rec[1]));
	        
	        return result;
	    }
	}

	class Student
	{
	    String studentId;
	    int totalScore;
	    int successfulAttempts;
	    int totalPenalties;
	    public Student(String studentId, int score, int success, int penalties)
	    {
	        this.studentId = studentId;
	        this.totalScore = score;
	        this.successfulAttempts = success;
	        this.totalPenalties = penalties;
	    }
	    
	}

