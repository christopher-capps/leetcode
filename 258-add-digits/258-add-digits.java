class Solution {
    public int addDigits(int num) {
        String numString = "" + num;
        int sum = Integer.parseInt(numString);
        while (numString.length() > 1) {
            sum = 0;
            char[] array = numString.toCharArray();
            for (char number : array) {
                String tempInt = "" + number;
                sum += Integer.parseInt(tempInt);
            }
            numString = "" + sum;
        }
        return sum;
    }
}