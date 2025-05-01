package nobubilt.codesignal.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindallIndicesOfSubstring {

    public static List<String> findSubString(List<String> origStrs, List<String> substrs) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < origStrs.size(); i++) {
            int start_pos = origStrs.get(i).indexOf(substrs.get(i));
            List<Integer> match_indices = new ArrayList<>();

            while (start_pos != -1) {
                match_indices.add(start_pos);
                start_pos = origStrs.get(i).indexOf(substrs.get(i), 
                		start_pos + substrs.get(i).length());
            }

            if (!match_indices.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("The substring '").append(substrs.get(i))
                .append("' was found in the original string '")
                  .append(origStrs.get(i)).append("' at position(s) ");
                for (int idx : match_indices)
                    sb.append(idx).append(", ");
                sb.setLength(sb.length() - 2);  // remove trailing comma and space
                sb.append(".");
                result.add(sb.toString());
            }
        }

        return result;
    }
    /**
     * The substring 'loW' was found in the original string 'HelloWorld' at position(s) 3.
The substring 'ear' was found in the original string 'LearningJava' at position(s) 1.
The substring 'o' was found in the original string 'GoForBroke' at position(s) 1, 3, 7.
The substring 'Ba' was found in the original string 'BackToBasics' at position(s) 0, 6.

     * @param args
     */

    public static void main(String[] args) {
        // Call the function
        List<String> result = findSubString(
            Arrays.asList("HelloWorld", "LearningJava", "GoForBroke", "BackToBasics"),
            Arrays.asList("loW", "ear", "o", "Ba")
        );
        for (String res : result) {
            System.out.println(res);
        }
    }
}


