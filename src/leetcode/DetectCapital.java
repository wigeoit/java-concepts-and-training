package leetcode;

/*
    We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".
    Given a string word, return true if the usage of capitals in it is right.

    Example 1:
    Input: word = "USA"
    Output: true

    Example 2:
    Input: word = "FlaG"
    Output: false

    Constraints:

    - 1 <= word.length <= 100
    - word consists of lowercase and uppercase English letters.
*/

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.length()== 1){
            return true;
        }

        int i = 2;

        boolean isUppercase = Character.isUpperCase(word.charAt(0)) ? true : false;
        boolean nextIsUppercase = Character.isUpperCase(word.charAt(1))  ? true : false;

        if (!isUppercase && nextIsUppercase){
            return false;
        }

        while(i < word.length()){
            if (isUppercase){
                if(nextIsUppercase){
                    if(Character.isLowerCase(word.charAt(i))){
                        return false;
                    }
                }else{
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }else{
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    //Not optimal solution
    public boolean detectCapitalUse2(String word) {

        if(word.equals(word.toLowerCase())
                || word.equals(word.toUpperCase())
                || word.equals(String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}
