package leetcode;

/*
    Given a string s, return the longest palindromic substring in s.

    Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

    Example 2:
        Input: s = "cbbd"
        Output: "bb"
*/

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        int max_length = 1;
        int n = s.length();
        int start = 0;
        int end = 0;

        for(int i = 0; i < n-1; i++){
            int left = i;
            int right = i;

            while(left >= 0 && right < n){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }

            int length = right - left -1;

            if(length > max_length){
                max_length = length;

                start = left+1;
                end= right-1;
            }
        }
        for(int i = 0; i < n-1 ; i++){
            int left = i;
            int right = i+1;
            while(left >= 0 && right < n){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    break;
                }

            }
            int length = right - left -1;
            if(length > max_length){
                max_length = length;

                start = left + 1;
                end = right -1;
            }
        }
        return s.substring(start, end+1);
    }

    public String longestPalindromeV2(String s) {
        String longestPalindrome = "";
        String stringToEvaluate = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j <s.length(); j++){
                if(i==0){
                    stringToEvaluate= s.substring(i);
                }else{
                    stringToEvaluate= s.substring(i,j);
                }
                if(isPalindromeSubstring(stringToEvaluate) && stringToEvaluate.length() > longestPalindrome.length()){
                    longestPalindrome = stringToEvaluate;
                }
            }
        }
        return longestPalindrome;
    }

    public boolean isPalindromeSubstring(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
