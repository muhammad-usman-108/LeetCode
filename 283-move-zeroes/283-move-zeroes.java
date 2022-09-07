class Solution {
    public void moveZeroes(int[] nums) {
        
        int lastNonZero = 0;
        
        for (int index=0; index<nums.length; index++) {
            if (nums[index] != 0) {
                nums[lastNonZero] = nums[index];
                lastNonZero++;
            }
        }
        
        for (int index=lastNonZero; index<nums.length; index++) {
            nums[index] = 0;
        }
        
    }
}