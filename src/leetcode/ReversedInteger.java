package leetcode;

public class ReversedInteger {
    public int reverse(int x) {
        int aux = Math.abs(x);
        long rev = 0;
        while(aux>0){
            rev = aux%10 + rev*10;
            aux = aux/10;
        }
        if(x < 0){
            rev = rev*-1;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
}
