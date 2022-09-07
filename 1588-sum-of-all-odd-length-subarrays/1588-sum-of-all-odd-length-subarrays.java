class Solution {
    public int sum_func(int start, int end, int[] nums) {
        int sum = 0;
        for (int i=start; i<=end; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j+=2) {
                sum = sum + sum_func(i, j, arr);
            }
        }
        return sum;
    }
}