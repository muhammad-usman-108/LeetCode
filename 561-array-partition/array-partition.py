class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        high = sum([nums[i] for i in range(0, len(nums), 2)])
        return high
        