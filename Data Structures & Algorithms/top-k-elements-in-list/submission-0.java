class Solution {
  class Pair implements Comparable<Pair> { 
        int count, value;
        public Pair( int value   ,int count){
            this.count = count;
            this.value = value;
        }
        public int compareTo(Pair p1){
            return this.count - p1.count;
        }

    }
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer , Integer> map = freqMap(arr);
        PriorityQueue<Pair> q = new PriorityQueue();
        for( Integer key : map.keySet()){
                q.offer(new Pair(key,map.get(key)));
                while( !q.isEmpty() && q.size()>k )q.poll();
        }
    
    int[] ans = new int[ q.size()];
    int m=0;
    while(!q.isEmpty()){
        ans[m++]=q.poll().value;
    }

    return ans;
        
        

    }
    public HashMap<Integer , Integer> freqMap(int[] arr ){
        HashMap<Integer , Integer> map = new HashMap<>();
        for( int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return map;
    }
}
