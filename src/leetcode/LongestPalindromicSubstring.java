package leetcode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        System.out.println("String to evaluate: " + s + " Length: " + longestPalindrome.length());

        String stringToEvaluate = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j <s.length(); j++){
                if(i==0){
                    stringToEvaluate= s.substring(i);
                }else{
                    stringToEvaluate= s.substring(i,j);
                }
                //System.out.println("Substring " + stringToEvaluate + " is palindrome result: " + isPalindromeSubstring(stringToEvaluate));
                //System.out.println("Substring " + stringToEvaluate + " length comparison result: " + (stringToEvaluate.length() > longestPalindrome.length()));
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

    public String longestPalindromeV2(String s) {
//     length is less than or equal to 1
        if(s.length()<=1){
            return s;
        }
        int max_length=1;
        int n=s.length();
        int st=0,end=0;

        //odd
        for(int i=0;i<n-1;i++){
            int l = i,r=i;

            while(l>=0&&r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
            }
            int len = r-l-1;
            if(len>max_length){
                max_length= len;

                st=l+1;
                end= r-1;
            }
        }

        //even length
        for(int i=0;i<n-1;i++){
            int l=i,r=i+1;
            while(l>=0&& r<n){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }

            }
            int len = r-l-1;
            if(len>max_length){
                max_length= len;

                st=l+1;
                end= r-1;
            }
        }
        return s.substring(st,end+1);
    }
}
