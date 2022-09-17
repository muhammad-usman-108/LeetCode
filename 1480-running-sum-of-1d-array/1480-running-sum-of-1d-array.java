class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return new int[0];
        }
        int[] sum  = new int[len];
        sum[0] = nums[0];
        
        for (int i=1; i<len; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        
        return sum;
    }
}