class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int i = 0;
        int len = s.length()-1;
        String r = "";
        while(i <= len) {
            if (s.charAt(i) == ' ') {
                String sub = s.substring(start, i);
                r = r + new StringBuilder(sub).reverse().toString() + " ";
                start = i + 1;
            }
            if (i == len) {
                String sub = s.substring(start, i+1);
                r = r + new StringBuilder(sub).reverse().toString();
            }
            i++;
        }
        return r;
    }
}