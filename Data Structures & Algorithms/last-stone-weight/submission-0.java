class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for( int x : stones){
            pq.add(x);
        }
        int a=0,b=0;
        System.out.println(pq);
        while(!pq.isEmpty() ){
    
             a = pq.poll();
            if(pq.isEmpty())return a;
             b = pq.poll();
            if(a==b )continue;
            else{
                 b= Math.abs(a-b);
                pq.add(b);
            }
        }
        return pq.isEmpty()?0:pq.poll();

    }
}