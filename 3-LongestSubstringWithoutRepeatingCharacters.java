// 3 : Longest Substring Without Repeating Characters
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxlength = Math.max(maxlength, i - left + 1); 
        }
        return maxlength;
    }
}
