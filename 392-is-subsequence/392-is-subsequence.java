class Solution {
    public boolean isSubsequence(String s, String t) {
        int sub = s.length();
        int slen = t.length();
        
        if (sub > slen) {
            return false;
        }
        if (sub == 0) {
            return true;
        }
        
        int sp = 0;
        int tp = 0;
        
        while (tp < slen) {
            
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
                
                if (sp == sub) {
                    return true;
                }
            }
            tp++;
        }
        return false;
    }
}