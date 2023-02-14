package leetcode;

/*
    Link: https://leetcode.com/problems/integer-to-roman

    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two one's added together.
    12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII. Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four. The same principle applies to the number
    nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given an integer, convert it to a roman numeral.

    Example 1:
        Input: num = 1994
        Output: "MCMXCIV"
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder retStr=new StringBuilder();
        while(num>0){
            if(num>=1000){
                num-=1000;
                retStr.append("M");
            }else if(num>=900){
                num-=900;
                retStr.append("CM");
            }else if(num>=500){
                num-=500;
                retStr.append("D");
            }else if(num>=400){
                num-=400;
                retStr.append("CD");
            }else if(num>=100){
                num-=100;
                retStr.append("C");
            }else if(num>=90){
                num-=90;
                retStr.append("XC");
            }else if(num>=50){
                num-=50;
                retStr.append("L");
            }else if(num>=40){
                num-=40;
                retStr.append("XL");
            }else if(num>=10){
                num-=10;
                retStr.append("X");
            }else if(num>=9){
                num-=9;
                retStr.append("IX");
            }else if(num>=5){
                num-=5;
                retStr.append("V");
            }else if(num>=4){
                num-=4;
                retStr.append("IV");
            }else if(num>=1){
                num-=1;
                retStr.append("I");
            }
        }
        return retStr.toString();
    }
    
    public String ntToRomanRecursive(int num) {
        if(num>=1000){ return "M" + ntToRomanRecursive(num-1000);}
        if(num>=900){ return "CM" + ntToRomanRecursive(num-900); }
        if(num>=500){ return "D" + ntToRomanRecursive(num-500);}
        if(num>=400){ return "CD" + ntToRomanRecursive(num-400);}
        if(num>=100){ return "C" + ntToRomanRecursive(num-100);}
        if(num>=90){ return "XC" + ntToRomanRecursive(num-90);}
        if(num>=50){ return "L" + ntToRomanRecursive(num-50);}
        if(num>=40){ return "XL" + ntToRomanRecursive(num-40);}
        if(num>=10){ return "X" + ntToRomanRecursive(num-10);}
        if(num==9){ return "IX";}
        if(num>=5){ return "V"+ ntToRomanRecursive(num-5);}
        if(num==4){ return "IV";}
        if(num>=1){ return "I"+ntToRomanRecursive(num-1);}
        return "";
    }
}
