class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] original = new int[changed.length/2];
        if (changed.length%2 == 1) {
            return new int[0];
        }
        
        HashMap<Integer, Integer> temp = new HashMap<>();
        
        for (int i=0; i<changed.length; i++) {
            if(temp.containsKey(changed[i])) {
                temp.put(changed[i], temp.get(changed[i]) + 1);
            } else {
                temp.put(changed[i], 1);
            }
        }
        
        Arrays.sort(changed);
        
        int index = 0;
        for (int i=0; i<changed.length; i++) {
            if(temp.containsKey(changed[i]*2)) {
                if (changed[i] == 0) {
                    if (temp.get(changed[i]) > 1) {
                        temp.put(changed[i], temp.get(changed[i]) - 2);
                        original[index] = changed[i];
                        index++;
                    }
                } else {
                    if (temp.get(changed[i]*2) > 0 && temp.get(changed[i]) > 0) {
                        temp.put(changed[i]*2, temp.get(changed[i]*2) - 1);
                        temp.put(changed[i], temp.get(changed[i]) - 1);
                        original[index] = changed[i];
                        index++;
                    }
                }
                
                if (changed.length/2 == index) {
                    return original;
                }
            }
        }
        
        return new int[0];
    }
}