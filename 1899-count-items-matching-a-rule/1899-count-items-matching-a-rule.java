class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int size = items.size();
        System.out.println(items.get(0).get(0));
        if(ruleKey.equals("type")) {
            for (int index = 0; index<size; index++) {
                if (items.get(index).get(0).equals(ruleValue))
                    count++;
            }
        } else if (ruleKey.equals("color")) {
            for (int index = 0; index<size; index++) {
                if (items.get(index).get(1).equals(ruleValue))
                    count++;
            }
        } else if (ruleKey.equals("name")) {
            for (int index = 0; index<size; index++) {
                if (items.get(index).get(2).equals(ruleValue))
                    count++;
            }
        }
        return count;
    }
}