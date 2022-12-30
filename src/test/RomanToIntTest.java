package test;

import leetcode.RomanToInt;

public class RomanToIntTest {
    public static void main(String[] args){
        RomanToInt romanToInt = new RomanToInt();

        System.out.println(romanToInt.romanToInt("XXVI"));
        System.out.println(romanToInt.romanToInt("XXIV"));
        System.out.println(romanToInt.romanToInt("IV"));
        System.out.println(romanToInt.romanToInt("MCC"));
        System.out.println(romanToInt.romanToInt("CD"));
        System.out.println(romanToInt.romanToInt("CM"));
    }
}
