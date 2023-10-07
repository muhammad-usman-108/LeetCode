class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<Integer,Integer>();
        int pairs = 0;
        for(int index=0; index<nums.length; index++) {
            if(ans.containsKey(nums[index])) {
                ans.put(nums[index], ans.get(nums[index]) + 1);
            } else {
                ans.put(nums[index], 1);
            }
        }
        for(Map.Entry<Integer, Integer> set : ans.entrySet()) {
            pairs = pairs + (set.getValue() * (set.getValue() - 1) / 2);
        }
        System.out.println(ans);
        return pairs;
    }
}