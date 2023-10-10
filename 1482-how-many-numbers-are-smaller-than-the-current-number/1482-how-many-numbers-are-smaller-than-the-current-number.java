class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] frequency = new int[101];

        for(int index=0; index<nums.length; index++) {
            frequency[nums[index]]++;
        }

        int current = 0;
        int previous = 0;
        for(int index=0; index<frequency.length; index++) {
            current = current + frequency[index];
            frequency[index] = previous;
            previous = current;
        }

        int[] result = new int[nums.length];
        for(int index=0; index<nums.length; index++) {
            result[index] = frequency[nums[index]];
        }
        return result;
    }
}