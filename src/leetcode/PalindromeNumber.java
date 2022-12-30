package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int aux = x;
        StringBuilder temp = new StringBuilder();
        List<Integer> tempList = new ArrayList();

        if(aux >= 0){
            if(x == 0){
                return true;
            }
            while(aux > 0){
                System.out.println(aux % 10);
                tempList.add(aux % 10);
                aux = aux/10;
            }

            for(Integer integer: tempList){
                temp.append(integer.intValue());
            }

            return temp.toString().equals(String.valueOf(x));
        }
        return false;
    }

    public boolean isPalindromeV2(int x) {
        int aux = x;
        StringBuilder temp = new StringBuilder();
        if(aux >= 0){
            if(x == 0){
                return true;
            }
            while(aux > 0) {
                System.out.println(aux % 10);
                temp.append(aux % 10);
                aux = aux / 10;
            }
            return temp.toString().equals(String.valueOf(x));
        }
        return false;
    }

    public boolean isPalindromeV3(int x) {
        int aux = x;
        if(aux >= 0){
            int rev = 0;
            while(x>0){
                rev = x%10 + rev*10;
                x= x/10;
            }
            return (rev == aux);
        }
        return false;
    }
}
