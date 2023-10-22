class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res = "";
        for (int index=0; index<words.size(); index++) {
            res = res + words.get(index).charAt(0);
        }
        if (res.equals(s)) return true;
        return false;
    }
}