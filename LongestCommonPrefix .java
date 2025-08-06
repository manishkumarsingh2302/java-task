public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Start by assuming the first string is the prefix
        String prefix = strs[0];

        // Compare the prefix with every other string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix length until it matches the start of current string
            while (strs[i].indexOf(prefix) != 0) {
                // Cut the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If there's no common prefix left
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input1));  // Output: "fl"

        String[] input2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(input2));  // Output: ""
    }
}
