class Solution {
public String longestCommonPrefix(String[] strs) {
        String output = "";
        int shortestLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < shortestLength) {
                shortestLength = str.length();
            }
        }
        if (shortestLength == 0) {
            return "";
        }
        char charToCompare;
        for (int i = 0; i < shortestLength; i++) {
            charToCompare = strs[0].charAt(i);
            for (String string : strs) {
                if (string.charAt(i) != charToCompare) {
                    return output;
                }
            }
            output += charToCompare;
        }
        return output;
    }
}