class Solution {
    public int maxProfit(int[] arr) {
        Deque<Integer> st = new LinkedList<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.addFirst(Integer.MIN_VALUE);
        for( int  i=n-1 ;i>=0; i--){
            int top= st.peekFirst();
            if(arr[i]>top){
                ans[i]=arr[i];
                st.removeFirst();
                st.push(arr[i]);
            }
          else{
            ans[i]=st.peek();
          }
        }
        int max= Integer.MIN_VALUE;
        for( int i = 0 ; i < n ; i++){
             max= Math.max(max,ans[i]-arr[i]);
        }
        return max;
        
    }
}
