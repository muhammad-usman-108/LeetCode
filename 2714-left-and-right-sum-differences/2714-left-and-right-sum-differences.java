class Solution {
    public int[] leftRightDifference(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int[] leftSum = new int[size];
        int[] rightSum = new int[size];

        leftSum[0] = 0;
        rightSum[size-1] = 0;
        for(int index=0; index<size-1; index++) {
            leftSum[index+1] = leftSum[index] + nums[index];
            rightSum[size-index-2] = rightSum[size-index-1] + nums[size-index-1];
        }
        for(int index=0; index<size; index++) {
            int diff = leftSum[index] - rightSum[index];
            answer[index] = (diff > 0)? diff: diff*-1;
        }
        return answer;
    }
}