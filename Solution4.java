import java.util.*;

class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}