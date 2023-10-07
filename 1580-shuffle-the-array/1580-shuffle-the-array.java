class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int count = 0;
        for (int index=0; index<2*n; index=index+2) {
            res[index] = nums[count];
            res[index + 1] = nums[n + count];
            count++;
        }
        return res;
    }
}