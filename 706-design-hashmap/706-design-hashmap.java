class MyHashMap {
    int SIZE = 769;
    LinkedList<Entry>[] map;
    public MyHashMap(){
        map = new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
        int index = key % SIZE;
        if(map[index]==null){
            map[index] = new LinkedList<Entry>();
            map[index].add(new Entry(key, value));
        }else{
            for(Entry entry : map[index]){
                if(entry.key == key){
                    entry.val=value;
                    return;
                }
            }
            map[index].add(new Entry(key, value));
        }
    }
    
    public int get(int key) {
        int index = key % SIZE;
        if(map[index]==null) return -1;
        LinkedList<Entry> entries = map[index];
        for(Entry entry : entries){
            if(entry.key == key) return entry.val;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key % SIZE;
        if(map[index] == null) return;
        else{
            Entry toRemove = null;
            for(Entry entry : map[index]){
                if(entry.key==key){
                    toRemove = entry;
                }
            }
            if(toRemove == null)return;
             map[index].remove(toRemove);
        }
    }
}
class Entry{
    public int key;
    public int val;
    
    public Entry(int key, int val){
        this.key = key;
        this.val = val;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */