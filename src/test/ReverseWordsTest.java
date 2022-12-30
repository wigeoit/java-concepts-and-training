package test;

import leetcode.ReverseWords;

public class ReverseWordsTest {
    public static void main(String[] args) {
        ReverseWords test = new ReverseWords();
        System.out.println(test.reverseWords("   hello    world   "));
        System.out.println(test.reverseWordsV2("   hello    world   "));
        System.out.println(test.reverseWordsV3("   hello    world   "));
    }
}
