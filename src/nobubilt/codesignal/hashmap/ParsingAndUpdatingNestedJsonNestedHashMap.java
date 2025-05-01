package nobubilt.codesignal.hashmap;

import java.util.HashMap;
import java.util.Map;
/**
 * You are given a string representation of a nested JSON object. Each JSON object is represented 
 * by key-value pairs enclosed within curly braces {}. Keys and values are separated by colons :, 
 * and distinct entries in an object are separated by commas ,. A value in a JSON object can be a 
 * string, a number, or another nested JSON object. For simplicity, we will not consider arrays or 
 * null values in this task.

For example, the string "{\"key1\": \"value1\", \"key2\": {\"key3\": \"value3\", 
\"key4\": \"value4\"}, \"key5\": \"value5\"}" represents the following JSON object:

JSON
Copy to clipboard
{
  "key1": "value1",
  "key2": {
    "key3": "value3",
    "key4": "value4"
  },
  "key5": "value5"
}
Your task is to transform the given string into a nested Java map structure and then update a 
specific key-value pair within the map. You should parse the JSON string into a Java nested map 
and then update the value associated with the key "key4" to the given update_value. The string 
and the new value will be provided as input to your function. The key "key4" could either be in 
the outer map or inside a nested map. Your function should return the updated map.

Note: If a value in the outer map is not a map itself but a string, convert it to a map where 
the original string is the key and an empty string "" is the value. For example, "key": "value" 
should be converted to "key": {"value": ""}.

The input string will contain from 1 to 500 characters, inclusive. For this task, we'll assume
 that all keys in the JSON object are unique.

Example Input: "{\"key1\": \"value1\", \"key2\": {\"key3\": \"value3\", \"key4\": \"value4\"},
 \"key5\": \"value5\"}", "newValue"

Expected Output:

JSON
Copy to clipboard
{
    "key1": {"value1": ""},
    "key2": {
        "key3": "value3",
        "key4": "newValue"
    },
    "key5": {"value5": ""}
}
 * 
 *
 */
public class ParsingAndUpdatingNestedJsonNestedHashMap {
	
    public Map<String, Map<String, String>> solution(String jsonString, String updateValue) {
        Map<String, Map<String, String>> resultMap = new HashMap<>();
	        Map<String, String> innerMap = new HashMap<>();
	 
	        boolean innerMapInd = false;
	        int inx = 0;
	        int len = jsonString.length();
	        String key = "";
	        if(jsonString.indexOf("{\"") == 0)
	        {
	            inx = "{\"".length();
	        }
	        while(inx < len)
	        {
	            if(jsonString.charAt(inx) == '{')
	            {
	                inx = inx + 1; // move past {
	                ++inx; // move past space
	                innerMapInd = true;
	            }
	            else if(jsonString.charAt(inx) == '}')
	            {
	                if(!innerMap.isEmpty())
					{
						resultMap.put(key, innerMap);
					}
	                innerMap = new HashMap<>();
	                innerMapInd = false;
					 inx = inx + 3; // move past }
                    if(inx > len) {break;}
	                if(inx < len && jsonString.charAt(inx) == ',')
	                {
	                    inx = inx +2;
	                }       
	            }
	            else if(!innerMapInd)
	            {
	            	if(jsonString.charAt(inx) == '\"')
	            	{
	            		++inx;
	            	}
	            	int endOfPhraseInx = jsonString.indexOf("\"", inx);
	                int colonInx = jsonString.indexOf(":", endOfPhraseInx);
	                key = jsonString.substring(inx,endOfPhraseInx);

	                if(colonInx != -1 && colonInx+ 2 < len)
	                {
	                    if(jsonString.charAt(colonInx+2) == '{')
	                    {
	                        inx = colonInx+2;      
	                        continue;
	                    }
	                }
	                if(colonInx != -1)
	                {
		                inx = colonInx +3;	                	
	                }

	                endOfPhraseInx = jsonString.indexOf("\"", inx);
	                String value =  jsonString.substring(inx,endOfPhraseInx);
	                endOfPhraseInx = Math.min(endOfPhraseInx, jsonString.length());
	                int commaInx = jsonString.indexOf(", ", endOfPhraseInx);
	                resultMap.put(key, new HashMap<>());
	                if(endOfPhraseInx < jsonString.length())
	                {
	                    resultMap.get(key).put(value, "");
	                    inx = endOfPhraseInx + 1;
	                }
	                if(commaInx != -1)
	                {
		                inx = commaInx+2;	                	
	                }
	            }
	            else if(innerMapInd)
	            {
	            	if(jsonString.charAt(inx) == '\"')
	            	{
	            		++inx;
	            	}
	                  int endOfPhraseInx = jsonString.indexOf("\"", inx);
					  if(endOfPhraseInx == -1)
					  {
						endOfPhraseInx = len;
					  }
	                int colonInx = jsonString.indexOf(":", endOfPhraseInx);
	                String innerKey = jsonString.substring(inx,endOfPhraseInx);
	                if(colonInx != -1)
	                {
	                	inx = colonInx +3;
	                }
	                
	                endOfPhraseInx = jsonString.indexOf("\"", inx);
					
	                String innerValue =  jsonString.substring(inx,endOfPhraseInx);
	                innerMap.put(innerKey, innerValue);
	             endOfPhraseInx = jsonString.indexOf("\"", inx);
	             int commaInx = jsonString.indexOf(", ", endOfPhraseInx);
	             int closingParen = jsonString.indexOf("}", endOfPhraseInx);
	             ++inx;
	             if(commaInx != -1 &&  closingParen != -1)
	             {
	            	 int endPosition = Math.min(commaInx < closingParen ? commaInx : len, closingParen);
	 	            if(endPosition == len)
	 	            {
	 	                endPosition = Math.max(commaInx, closingParen); 	 
	 	            } 
	 	           inx = endPosition;
	 	          if(commaInx < closingParen)
	                {
	 	        	 inx = inx+2;
	                }    
	             }
				else if(closingParen != -1)
				{
					int endPosition = closingParen < len ? closingParen : len;
					inx = endPosition;
				}
	            }
	         }
             updateMap(resultMap, updateValue);
	        return resultMap;
    }
    
	public static void updateMap(Map<String, Map<String, String>> map, String value) 
	{
		if(map.containsKey("key4"))
		{
			Map<String, String> inner = new HashMap<>();
			inner.put(value, "");
			map.put("key4", inner);
		}
		else
		{
			for(String key : map.keySet())
			{
				Map<String, String>  subMap = map.get(key);
				if(subMap.containsKey("key4"))
				{
					subMap.put("key4", value);
				}
			}
		}	   
	}
}
