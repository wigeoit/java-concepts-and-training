package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringNoRepeating {
    public int lengthOfLongestSubstring(String s) {
        // Base condition
        if (s == null || s.equals("")) {
            return 0;
        }
        // Starting window index
        int start = 0;
        // Ending window index
        int end = 0;
        // Maximum length of substring
        int maxLength = 0;
        // This set will store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();
        // Loop for each character in the string
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {
        List<Character> charactersIn = new ArrayList<>();
        String lastSubstring = "";
        int result = 0;
        int partialResult = 0;
        int aux = 0;
        while (aux < s.length()){
            for (int i = aux; i < s.length(); i++){
                StringBuilder substring = new StringBuilder();
                if(charactersIn.contains(Character.valueOf(s.charAt(i)))) {
                    if(partialResult < charactersIn.size()){
                        partialResult = charactersIn.size();
                        if(lastSubstring.length() < substring.toString().length()){

                            System.out.println("Adding Substring: " + substring.toString());
                            lastSubstring = substring.toString();
                        }
                        charactersIn.clear();
                        substring.setLength(0);
                        substring.append(s.charAt(i));
                        charactersIn.add(s.charAt(i));
                        System.out.println("Substring: " + substring.toString());
                    }
                }else{
                    System.out.println("Substring: " + substring.toString());
                    substring.append(s.charAt(i));
                    charactersIn.add(s.charAt(i));
                }

            }
            aux++;
        }

        result = lastSubstring.length();
        System.out.println("Last Substring: " + lastSubstring);
        return result;
    }
}
