class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int index=0; index<nums.size(); index++) {
            if (countBinaryBits(index) == k) {
                sum = sum + nums.get(index);
            }
        }
        
        return sum;
    }
    public int countBinaryBits(int decimal) {
        int binaryCount = 0;

        while (decimal > 0) {
            int rem = decimal % 2;
            decimal = decimal / 2;
            if (rem == 1) {
                binaryCount++;
            }
        }

        return binaryCount;
    }
}