package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {
        System.out.println("First version");
        String[] temp = s.trim().split("\\s+");
        Stack<String> stringStack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < temp.length; i++){
            System.out.println("Adding word to the stack - position: " + i + " word: " + temp[i]);
            stringStack.push(temp[i]);
        }
        int stringStackSize = stringStack.size();
        for(int i = 0; i < stringStackSize; i++){
            stringBuilder.append(stringStack.pop());
            stringBuilder.append(" ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);

        return stringBuilder.toString();
    }

    public String reverseWordsV2(String s) {
        System.out.println("Second version");
        String[] temp = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = temp.length-1; i >= 0; i--){
            stringBuilder.append(temp[i]);
            if(i>0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public String reverseWordsV3(String s) {
        System.out.println("Third version");
        return Arrays.stream(s.trim().split("\\s+"))
                .reduce((ss, w) -> w + " " + ss)
                .orElse("");
    }

}
