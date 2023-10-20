class Solution {
    int digitSum(int num) {
        int sum = 0;
        while(num !=0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int index=0; index<nums.length; index++) {
            element_sum = element_sum + nums[index];
            digit_sum = digit_sum + digitSum(nums[index]);
        }
        return (element_sum - digit_sum) > 0? element_sum - digit_sum: -1 * (element_sum - digit_sum);
    }
}