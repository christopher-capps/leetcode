class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> numberMap = new HashMap<>();

        for(int num : nums) {
            if (numberMap.containsKey(num)) {
                numberMap.put(num, numberMap.get(num) + 1);
            } else {
                numberMap.put(num, 1);
            }
        }

        for(int num : numberMap.keySet()) {
            if (numberMap.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}