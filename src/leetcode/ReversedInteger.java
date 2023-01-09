package leetcode;

/*
    Link: https://leetcode.com/problems/reverse-integer/

    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:
        Input: x = 123
        Output: 321

    Example 2:
        Input: x = -123
        Output: -321

    Example 3:
        Input: x = 120
        Output: 21
*/
public class ReversedInteger {
    public int reverse(int x) {
        int aux = Math.abs(x);
        long rev = 0;

        while(aux > 0){
            rev = aux % 10 + rev * 10;
            aux = aux / 10;
        }
        if(x < 0){
            rev *= -1;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
}
