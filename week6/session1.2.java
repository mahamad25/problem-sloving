class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {

            if (n % len != 0) {
                continue;
            }

            String sub = s.substring(0, len);
            boolean valid = true;

            for (int i = 0; i < n; i += len) {
                if (!s.substring(i, i + len).equals(sub)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }
}
output
  Input: abab
Output: true
  Input: aba
Output: false
  Input: abcabcabcabc
Output: true
