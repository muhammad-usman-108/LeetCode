class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for(int index=0; index<size; index++) {
            sum = sum + mat[index][index] + mat[index][size-1-index];
        }
        if (size%2 == 1) {
            sum = sum - mat[(size-1)/2][(size-1)/2];
        }
        return sum;
    }
}