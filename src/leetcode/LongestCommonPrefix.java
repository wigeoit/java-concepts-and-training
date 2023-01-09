package leetcode;

import java.util.*;
import java.util.stream.IntStream;

/*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

    Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefixBuilder = new StringBuilder();
        int lessWordSize = 200;
        final int ARRAY_LENGTH= strs.length;

        if(ARRAY_LENGTH == 1){
            return strs[0];
        }

        for(int i = 0; i < strs.length; i++ ){
            lessWordSize = Math.min(lessWordSize, strs[i].length());
        }

        int iterator = 0;

        while(iterator < lessWordSize && prefixBuilder.toString().length() == iterator){
            String result = checkPrefixMatch(strs, iterator, ARRAY_LENGTH);
            if( result != null && prefixBuilder.toString().length() == iterator){
                prefixBuilder.append(result);
            }
            iterator++;
        }
        return prefixBuilder.toString();
    }

    private String checkPrefixMatch(String[] strs, int column, int length){
        String word = "";
        for(int i = 1; i < length; i++){
            if(strs[i].charAt(column) != strs[i-1].charAt(column)){
                return null;
            }
            word = String.valueOf(strs[i].charAt(column));
        }
        return word;
    }

    public String longestCommonPrefixStream(String[] strs) {

        IntStream stream = new ArrayList<String>(Arrays.asList(strs)).stream().mapToInt(String::length);
        int minValue = stream.min().orElse(0);;

        StringBuilder prefixBuilder = new StringBuilder();
        //int lessWordSize = 200;

        if(strs.length == 1){
            return strs[0];
        }

        int iterator = 0;

        while(iterator < minValue && prefixBuilder.toString().length() == iterator){
            String result = checkPrefixMatch(strs, iterator, strs.length);
            if( result != null && prefixBuilder.toString().length() == iterator){
                prefixBuilder.append(result);
            }
            iterator++;
        }
        return prefixBuilder.toString();
    }

    public String longestCommonPrefixOptimal(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()){
                    return "";
                }
            }
        return prefix;
    }
}
