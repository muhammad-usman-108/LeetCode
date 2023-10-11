class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int index=0; index<sentences.length; index++) {
            int count = 0;
            for(int alpha=0; alpha<sentences[index].length(); alpha++) {
                if(sentences[index].charAt(alpha) == ' ') {
                    count++;
                }
            }
            count++;
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}