import java.util.*;

public class Solution {

    // Complete the birthday function
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        
        // Check every possible segment of length m
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        
        int d = sc.nextInt(); // Ron's birth day = sum
        int m = sc.nextInt(); // Ron's birth month = length
        
        int result = birthday(s, d, m);
        System.out.println(result);
        
        sc.close();
    }
}
output
  2
