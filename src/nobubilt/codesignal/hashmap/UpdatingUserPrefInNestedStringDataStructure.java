package nobubilt.codesignal.hashmap;

import java.util.HashMap;
import java.util.Map;
/**
 * Imagine that you are a database manager dealing with a data structure in the form of a 
 * complex nested string. This string contains user data and is structured in such a way that 
 * user attributes are separated by semicolons (;), and within each user, the attribute-value 
 * pairs are separated by colons (:). Some of the user attributes themselves contain nested 
 * attribute-value pairs, which are enclosed in curly braces ({}).

Here's an example of such a string:

"User1:Age1=21;Location1=USA;Preferences1={Food1=Italian; Sport1=Fencing};User2:Age2=30; 
Location2=Canada; Preferences2={Music2=Jazz; Color2=Blue}".
You need to write a Java function that will convert the string into a nested map, following 
the structure shown in the string. After the string has been converted into a map, the function 
should update the value of a user-preference pair for any user to a requested value and return 
the updated map.

In this string, the keys representing the user names contain numbers (User1, User2, etc.). You 
should also provide an option to find users by their numerical indices following the "User" 
keyword, such as 1 for User1, 2 for User2, and so on.

Your function should take the input string, the user index, the preference key, and the new 
value for the preference pair, and should return the updated map in the end.

The size of the input string will be less than or equal to 500 characters.

Example

Given:

Java
Copy to clipboard
String input = "User1:Age1=21;Location1=USA;Preferences1={Food1=Italian;Sport1=Fencing};
User2:Age2=30;Location2=Canada;Preferences2={Music2=Jazz;Color2=Blue}";
int userIndex = 1;
String prefKey = "Sport1";
String newValue = "Hockey";
The function should return:

Java
Copy to clipboard
Map<String, Map<String, String>> result = new HashMap<>();
result.put("User1", Map.of("Age1", "21", "Location1", "USA", "Preferences1", 
"{Food1=Italian;Sport1=Hockey}"));
result.put("User2", Map.of("Age2", "30", "Location2", "Canada", "Preferences2", 
"{Music2=Jazz;Color2=Blue}"));
Cosmo • Just now

 * 
 *
 */
public class UpdatingUserPrefInNestedStringDataStructure {
    public Map<String, Map<String, String>> updatePreference(String inputString, 
    		int userIndex, String prefKey, String newValue) {
        Map<String, Map<String, String>> resultMap = new HashMap<>();
        int inx = 0;
        int len = inputString.length();
        String key ="";
        Map<String, String> innerMap = new HashMap<>();
        boolean nestedInd = false;
        while(inx < len)
        {
            if(inputString.charAt(inx) == ':')
            {
                ++inx;
                nestedInd = true;
            }
            else if(inputString.charAt(inx) == '}')
            {
                if(!innerMap.isEmpty())
                {
                 resultMap.put(key, innerMap);                    
                }
                inx = inx + 2;
                if(inx > len)
                {
                    break;
                }
                nestedInd = false;
                innerMap = new HashMap<>();            
            }
            if(!nestedInd)
            {
                int colonInx = inputString.indexOf(":", inx);
                if(colonInx != -1)
                {
                    key = inputString.substring(inx, colonInx);
                    inx = colonInx;
                }
            }
            else if(nestedInd)
            {
                int equalSignInx = inputString.indexOf("=", inx);
                if(equalSignInx != -1)
                {
                    String innerKey = inputString.substring(inx, equalSignInx);
                     String innerValue ="";
                    if(equalSignInx + 1 < len && inputString.charAt(equalSignInx+1) == '{')
                    {
                        inx  = equalSignInx +1;
                        int closingParen = inputString.indexOf("}", inx);
                        if(closingParen != -1)
                        {
                             innerValue = inputString.substring(inx, closingParen+1);       
                    //        System.out.println("innerKey: " + innerKey  + " innerValue: "+innerValue);
                            innerMap.put(innerKey, innerValue);
                            inx = closingParen;
                       
                        }
                         
                    }
                    else
                    {
                    inx = equalSignInx+1;                 
                    int semiColon = inputString.indexOf(";", equalSignInx);
                    innerValue = inputString.substring(inx, semiColon);       
                    inx = semiColon + 1;
                    }
   //               System.out.println("innerKey: " + innerKey  + " innerValue: "+innerValue);
                    innerMap.put(innerKey, innerValue);
                 
                }
          
            }
        }
        updatePreference(resultMap, userIndex, prefKey, newValue);
        // TODO: Implement the function
        return resultMap;
    }
    
    public void updatePreference( Map<String, Map<String, String>> resultMap, int userIndex, String prefKey, String newValue)
    {
        String key = "User"+userIndex;
        Map<String, String> entry = resultMap.get(key);
        String innerKey = "Preferences"+userIndex;
        String currVal = entry.get(innerKey);
        if(currVal != null)
        {
             int startInx = currVal.indexOf(prefKey);
             int equalsPos = currVal.indexOf("=", startInx);
             if(equalsPos != -1)
             {
                StringBuilder sb = new StringBuilder();
                sb.append(currVal.substring(0, equalsPos+1));
                sb.append(newValue);
                int endPos = currVal.length();
                int closingParen = currVal.indexOf("}", equalsPos);
                int semiColon = currVal.indexOf(";", equalsPos);
                if(closingParen != -1 && semiColon == -1)
                {
                    endPos = closingParen;
                }
                else if(semiColon != -1)
                {
                    endPos = semiColon;
     //               System.out.println("here "+ currVal.substring(endPos));
                }
                sb.append(currVal.substring(endPos));
                resultMap.get(key).put(innerKey, sb.toString());
             }        
        }

        

    }
}
