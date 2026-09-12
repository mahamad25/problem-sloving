import java.io.*;
import java.util.*;

public class Solution {

    public static String rotate(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }

    public static int longestPalindrome(String s) {
        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                max = Math.max(max, right - left + 1);
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                max = Math.max(max, right - left + 1);
                left--;
                right++;
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        for (int k = 0; k < n; k++) {
            String rotated = rotate(s, k);

            int answer = longestPalindrome(rotated);

            System.out.println(answer);
        }
    }
}
output
12
12
10
8
8
9
11
13
11
9
8
8
10
