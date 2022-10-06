class TimeMap {
    
    HashMap<String , ArrayList<Pair<Integer , String>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key , new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp , value));
    }
    
    public String get(String key, int timestamp) {
        ArrayList<Pair<Integer , String>> cur = map.get(key);
        if(cur == null) return "";
        int i = 0;
        int j = cur.size() - 1;
        String ans = "";
        while(i <= j){
            int mid = (i+j) / 2;
            if(cur.get(mid).getKey() <= timestamp){
                ans = cur.get(mid).getValue();
                i = mid + 1;
            }else if(cur.get(mid).getKey() > timestamp){
                j = mid - 1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */