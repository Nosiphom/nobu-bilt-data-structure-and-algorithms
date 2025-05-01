package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParsingUpdatingNestedKeyValData {
/**
 * You are given a delimited text file consisting of user information. Each row represents a user, 
 * with a unique identifier followed by the user's details, structured as a comma-separated 
 * key-value string. However, this data is not flat. Some values in the key-value pair can be 
 * another key-value string, enclosed in parentheses and separated by semicolons.

The input structure for each line is as follows:

Plain text
Copy to clipboard
"ID,Key1=Value1,Key2=(SubKey1=SubValue1;SubKey2=SubValue2),Key3=Value3,..."
For example,

Plain text
Copy to clipboard
"001,Age=25,Name=John,Address=(Street=Main St;City=NY;Zip=10001),
Email=john@gmail.com\n002,Age=30,Name=Jane,Address=(Street=2nd St;City=LA;Zip=90001),
Email=jane@hotmail.com"
Users are divided by \n.

Your task is to write a Java function that will parse this data and output a list of maps, one 
map for each user's information. Each map should translate the user's details from the string into 
key-value pairs, including the nested structure. Then, you need to update a specific user's detail, 
identified by the unique identifier and the key name. Let's assume you need to update the Email of 
the user with ID "001".

Your Java function should first parse these lines into the above maps, then locate the appropriate 
user and detail to update. The function should ultimately return the updated list of maps.

Constraints:

The number of users in the file is limited to 500.
Each ID is unique and comprises alphanumeric characters only.
Each Key (and SubKey) in the user data is an alphanumeric string without spaces.
Each Value (and SubValue) can be any alphanumeric string and may contain spaces.
The SubValue strings may contain other nested key-value pairs but not more than one level deep 
(i.e., no nested key-value pairs within SubValue strings).
The key-value pairs do not repeat. If one user’s data includes a key-value pair, no other user’s
 data will have the same key-value pair.
All strings are case-sensitive.
Consider the following input data:

Java
Copy to clipboard
String data = "001,Age=25,Name=John,Address=(Street=Main St;City=NY;Zip=10001),
Email=john@gmail.com\n002,Age=30,Name=Jane,Address=(Street=2nd St;City=LA;Zip=90001),
Email=jane@hotmail.com";
String userid = "001";
String key = "Email";
String newValue = "johndoe@gmail.com";
To update the email of the user with ID "001" to "johndoe@gmail.com", the function would transform 
the data into:

Java
Copy to clipboard
{
  {
    "001", {
      {"Age", "25"},
      {"Name", "John"},
      {"Address", "Street=Main St;City=NY;Zip=10001"},
      {"Email", "johndoe@gmail.com"}
    }
  },
  {
    "002", {
      {"Age", "30"},
      {"Name", "Jane"},
      {"Address", "Street=2nd St;City=LA;Zip=90001"},
      {"Email", "jane@hotmail.com"}
    }
  }
}
 * @param data
 * @param userid
 * @param key
 * @param newValue
 * @return
 */
    public static List<Map<String, Map<String, String>>> solution(String data, String userid, 
    		String key, String newValue) {
        // TODO: Implement the solution following the task description
        List<Map<String, Map<String, String>>> result = new ArrayList<>();
         Map<String, Map<String, String>> outerMap = new HashMap<>();
         Map<String, String> innerMap = new HashMap<>();
         String idStr ="";
         int len = data.length();
         int inx = 0;
         boolean innerMapInd = false;
         while(inx < len)
         {
            if(data.charAt(inx) == '\n' || inx == len-1)
            {
                if(!innerMap.isEmpty())
                {
                    outerMap.put(idStr, innerMap);
                    result.add(outerMap);
                }
                ++inx;
                if(inx >= len){break;}
                System.out.println("result size: " + result.size());
                System.out.println("innerMap size: " +innerMap.size());
                innerMapInd = false;
                innerMap = new HashMap<>();
                outerMap = new HashMap<>();

             //   inx = len;
            }
            else if(!innerMapInd)
            {
                int commaInx = data.indexOf(",", inx);
                String record = data.substring(inx, commaInx);
                if(!record.contains("="))
                {
                    idStr = record;
                    inx = commaInx + 1;
                    innerMapInd = true;
                }               
            }
            else if(innerMapInd)
            {
                int equalsPos = data.indexOf("=", inx);
                int endOfLineInx = data.indexOf("\n", inx);
                int commaInx = data.indexOf(",", inx);
                if(equalsPos != -1)
                {
                    String innerKey = data.substring(inx, equalsPos);
                    if(equalsPos + 1 < len && data.charAt(equalsPos + 1) == '(')
                    {
                        int closingBraceInx = data.indexOf(")", 
                        inx);
                        
                        if(closingBraceInx != -1)
                        {
                            inx = equalsPos + 1; 
                            String innerValue= data.substring(inx, closingBraceInx+1);
                            innerMap.put(innerKey, innerValue);   
                            inx = closingBraceInx + 2;
                        }   
                                        
                    }
                    else if(equalsPos != -1 && endOfLineInx != -1 && commaInx != -1 && equalsPos < endOfLineInx && endOfLineInx < commaInx)
                    {
                         inx = equalsPos + 1; 
                        String innerValue = data.substring(inx, endOfLineInx);
                        innerMap.put(innerKey, innerValue);  
                        System.out.println("middle: " + innerKey + "  " + innerValue + "  " +inx);                       
                        inx = endOfLineInx;
                    
                    }
                    else
                    {
                        inx = equalsPos + 1;
                        commaInx = data.indexOf(",", inx);
                        if(commaInx != -1)
                        {
                            String innerValue = data.substring(inx, commaInx);
                            innerMap.put(innerKey, innerValue);             
                            inx = commaInx+1;   
                             System.out.println("top: " + innerKey + "  " + innerValue + "  " +inx);                
                        }
                        else
                        {
                            String innerValue = data.substring(inx);
                            innerMap.put(innerKey, innerValue);             
                            inx = len-1;   
                             System.out.println("bottom: " + innerKey + "  " + innerValue + "  " +inx);             
                        }
                       
                    
                    }
                }
            }
         }
        updateParameters(result, userid, key, newValue);
        return result;
    }
    
    public static void updateParameters(List<Map<String, Map<String, String>>> result, String userid, String key, String newValue)
    {
        for(Map<String, Map<String, String>> resultMap : result)
        {
            if(resultMap.containsKey(userid))
            {
                Map<String, String> innerMap = resultMap.get(userid);
                innerMap.put(key, newValue);
                break;
            }
        }
    }
}
