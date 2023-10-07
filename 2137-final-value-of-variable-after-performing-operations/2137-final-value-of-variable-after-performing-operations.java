class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (int index = 0; index < operations.length; index++) {
            if (operations[index].equals("++X") || operations[index].equals("X++")) {
                value++;
            } else if (operations[index].equals("--X") || operations[index].equals("X--")) {
                value--;
            }
        }
        return value;
    }
}