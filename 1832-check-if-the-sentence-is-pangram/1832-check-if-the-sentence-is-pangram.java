class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();

        for (int i = 0; i < sentence.length(); i++)
        {
            alphabet.put(sentence.charAt(i), 1);
        }
        
        if (alphabet.size() == 26) {
            return true;
        }
        return false;
    }
}