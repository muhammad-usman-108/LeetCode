class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        int[] target = new int[size];
        ArrayList<Integer> temp = new ArrayList<>();
        for (int ind=0; ind<size; ind++) {
            temp.add(index[ind], nums[ind]);
        }
        for (int ind=0; ind<size; ind++) {
            target[ind] = temp.get(ind);
        }
        return target;
    }
}