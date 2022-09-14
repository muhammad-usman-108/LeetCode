class Solution {
    public int getMaximumGenerated(int n) {
        if (n<1) {
            return n;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        int max = nums[1];
        
        for (int i=2;i<=n;i++) {
           if (i%2==0) {
               nums[i] = nums[i/2];
               if (max < nums[i]) {
                   max = nums[i];
               }
           } else {
               nums[i] = nums[i/2] + nums[(i/2)+1];
               if (max < nums[i]) {
                   max = nums[i];
               }
           }
        }
        
        return max;
    }
}