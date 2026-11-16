class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        nge[n-1]=n-1;
        st.push(n-1);
        for( int i = n-2 ; i >=0 ; i--){
            while(!st.isEmpty() && arr[i]>= arr[st.peek()]) st.pop();
            nge[i]=st.isEmpty()? i:  st.peek();
            st.push(i);
        } 
        for(int j = 0 ; j< n ; j++){
            nge[j]=nge[j]-j;
        }
        return nge;
        
    }
}
