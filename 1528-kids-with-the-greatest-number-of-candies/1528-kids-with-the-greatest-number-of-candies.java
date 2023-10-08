class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandy = 0;
        int size = candies.length;
        for(int index=0; index<size; index++) {
            if(candies[index] > greatestCandy) greatestCandy = candies[index];
        }
        List<Boolean> result = new ArrayList<Boolean>();
        for(int index=0; index<size; index++) {
            if(candies[index] + extraCandies >= greatestCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}