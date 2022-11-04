class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (set.contains(c1) && set.contains(c2)) {
                sb.replace(left, left + 1, String.valueOf(c2));
                sb.replace(right, right + 1, String.valueOf(c1));
                left++;
                right--;
            } else if (set.contains(c1)) {
                right--;
            }
            else if (set.contains(c2)) {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}