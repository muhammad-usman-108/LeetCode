class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        temp = []
        for i in range(0, len(nums)):
            if (target - nums[i]) in temp:
                return [temp.index(target - nums[i]), i]
            temp.append(nums[i])