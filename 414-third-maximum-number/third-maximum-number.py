class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        unique = set(nums)
        unique = sorted(unique)
        if len(unique) >= 3:
            return unique[-3]
        else:
            return unique[-1]
        