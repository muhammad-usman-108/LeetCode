class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int index = 0;
        while(count != k && index<s.length()) {
            if (s.charAt(index) == ' ') {
                count++;
            }
            index++;
        }
        return s.substring(0, count==k? index-1: index);
    }
}