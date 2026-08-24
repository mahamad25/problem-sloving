class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        String pCode = encode(pattern);
        for (String w : words) {
            if (encode(w).equals(pCode)) {
                ans.add(w);
            }
        }
        return ans;
    }
    
    private String encode(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int id = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, id++);
            }
            sb.append(map.get(c)).append("#");
        }
        return sb.toString();
    }
}
output
["mee","aqq"]
