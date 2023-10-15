class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuf = new char[indices.length];
        String res = "";
        for(int index=0; index< indices.length; index++) {
            shuf[indices[index]] = s.charAt(index);
        }
        for(int index=0; index< indices.length; index++) {
            res = res + shuf[index];
        }
        return res;
    }
}