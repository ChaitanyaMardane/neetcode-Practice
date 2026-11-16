class Solution {
    public int maxProfit(int[] arr) {
        Deque<Integer> st = new LinkedList<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]=arr[n-1];
        st.addFirst(arr[n-1]);
        for( int  i=n-2 ;i>=0; i--){
            int top= st.peekFirst();
            if(arr[i]>top){
                ans[i]=arr[i];

                while(arr[i]>=top && !st.isEmpty()){
                    st.removeFirst();
                }
                st.push(arr[i]);
            }
          else{
            ans[i]=st.peek();
          }
        }
        System.out.print(Arrays.toString(ans));
        int max= Integer.MIN_VALUE;
        for( int i = 0 ; i < n ; i++){
             max= (int)Math.max(max,ans[i]-arr[i]);
        }
        return max;
        
    }
}
