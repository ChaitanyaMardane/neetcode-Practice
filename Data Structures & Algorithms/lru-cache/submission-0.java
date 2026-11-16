class LRUCache {

     private  int capacity;
    private HashMap<Integer , LinkedListNode> cache;
    LinkedList<LinkedListNode>  lruList;


    private class LinkedListNode{
        int key, value;
         LinkedListNode(int key , int value) {
             this.key=key;
             this.value=value;
        }
    }
    public LRUCache(int capacity){
        this.capacity=capacity;
        cache= new HashMap<>();
        lruList= new LinkedList<>();
    }

    public int get(int key) {
         if(cache.containsKey(key)){
             LinkedListNode node = cache.get(key);
             lruList.remove(node);
             lruList.addFirst(node);
             return node.value;
         }
         return -1;
    }

    public  void put(int key , int value){
        if(cache.containsKey(key)){
            LinkedListNode node = cache.get(key);
            lruList.remove(node);
            node.value= value;
            lruList.addFirst(node);
        }else{
            if(cache.size()>= capacity){
                cache.remove(lruList.removeLast().key);
                LinkedListNode node = new LinkedListNode(key,value);
                lruList.addFirst(node);
                cache.put(key,node);
            }else{
                 LinkedListNode node = new LinkedListNode(key,value);
                 lruList.addFirst(node);
                 cache.put(key,node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */