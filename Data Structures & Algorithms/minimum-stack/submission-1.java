class MinStack {

    Deque<Integer> st ;
    PriorityQueue<Integer> minq= new PriorityQueue<>();

    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        minq.offer(val);
    }
    
    public void pop() {
        int e =st.pop();
        minq.remove(e);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minq.peek();
    }
}
