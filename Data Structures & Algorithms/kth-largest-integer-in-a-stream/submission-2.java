class KthLargest {
    int k ;
private PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] arr) {
        this.pq= new PriorityQueue<>();
        this.k=k;
        for (  int i = 0 ; i < arr.length; i++){
            this.pq.add(arr[i]);
            if(this.pq.size()>k) this.pq.remove();
        }
    }
    
    public int add(int val) {
        this.pq.add(val);
        if(this.pq.size()>k) this.pq.remove();
        return pq.peek();
    }
}
