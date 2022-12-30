package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        String romanNumber = s.toUpperCase();

        Map<Character,Integer> romanNumbersMap = new HashMap<>();

        romanNumbersMap.put('I',1);
        romanNumbersMap.put('V',5);
        romanNumbersMap.put('X',10);
        romanNumbersMap.put('L',50);
        romanNumbersMap.put('C',100);
        romanNumbersMap.put('D',500);
        romanNumbersMap.put('M',1000);

        int stringLength = s.length();
        int intReturn = romanNumbersMap.get(romanNumber.charAt(stringLength-1));


        for(int i= stringLength-2; i >= 0; i--) {
            if (romanNumbersMap.get(romanNumber.charAt(i)) >= romanNumbersMap.get(romanNumber.charAt(i + 1))) {
                intReturn += romanNumbersMap.get(romanNumber.charAt(i));
            } else {
                intReturn -= romanNumbersMap.get(romanNumber.charAt(i));
            }
        }
        return intReturn;
    }

    public int romanToIntVersion2(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
