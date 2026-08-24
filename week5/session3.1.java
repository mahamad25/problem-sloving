class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        // 1. Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string ended after spaces
        if (i == n) return 0;

        // 2. Determine sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Conversion
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Check overflow and rounding
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (result * sign);
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myAtoi("42")); // 42
        System.out.println(sol.myAtoi(" -042")); // -42
        System.out.println(sol.myAtoi("1337c0d3")); // 1337
        System.out.println(sol.myAtoi("0-1")); // 0
        System.out.println(sol.myAtoi("words and 987")); // 0
        System.out.println(sol.myAtoi("91283472332")); // 2147483647
    }
}
output
42
  
