class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int diff = target - nums[i];
            if(temp.containsKey(diff)) {
                ans[0] = i;
                ans[1] = temp.get(diff);
                return ans;
            }
            temp.put(nums[i],i);
        }
        return ans;
    }
}