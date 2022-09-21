class Solution {
    public int sum_of_array(int[] nums, int len) {
        int sum = 0;
        for(int i=0; i<len; i++) {
            if (nums[i]%2 == 0) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int num_len = nums.length;
        int[] answer = new int[num_len];
        int sum = sum_of_array(nums, num_len);;
        
        for(int i=0; i<queries.length; i++) {
            if(nums[queries[i][1]]%2==0) {
                 sum-=nums[queries[i][1]];
            }
            nums[queries[i][1]]+=queries[i][0];
            if(nums[queries[i][1]]%2==0) {
               sum+=nums[queries[i][1]];
            }
            answer[i]=sum;
        }
        return answer;
    }
}

