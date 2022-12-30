package leetcode;

public class StringToIntegerATOI {
    public int myAtoi(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        char[] str = s.toCharArray();
        int sign = 1;
        int base = 0;
        int i = 0;

        while (str[i] == ' ')
        {
            i++;
        }
        System.out.println(String.copyValueOf(str));
        if (str[i] == '-' || str[i] == '+')
        {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }
        while (i < str.length && str[i] >= '0' && str[i] <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str[i] - '0' > 7))
            {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
}
