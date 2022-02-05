class Solution {
    public boolean isPalindrome(int x) {
        String intAsString = "" + x;
        int length = intAsString.length();
        if (length == 1) {
            return true;
        } else if (length == 2) {
            return (intAsString.charAt(0) == intAsString.charAt(1));
        } else {
            for (int i = 0; i < (length / 2); i++) {
                if (intAsString.charAt(i) != intAsString.charAt(length - (i + 1))) {
                    return false;
                }
            }
        }
        return true;
    }
}