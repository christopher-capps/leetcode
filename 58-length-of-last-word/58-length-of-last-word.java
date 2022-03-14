class Solution {
    public int lengthOfLastWord(String s) {

        String[] stringArray = s.split(" ");
        int maxLength = 0;

        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (stringArray[i].length() > 0) {
                return stringArray[i].length();
            }
        }
        return 0;
    }
}