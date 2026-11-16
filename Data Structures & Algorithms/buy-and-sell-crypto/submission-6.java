class Solution {
    public int maxProfit(int[] arr) {
        // Deque<Integer> st = new ArrayDeque<> ();
        int n = arr.length;
        // if(n<=1)return 0;
        // st.push(n-1);
        // int[] rge = new int[n];
        // int max = Integer.MIN_VALUE ;
        // rge[n-1]=0;
        // for( int i = n-2; i>=0;i--){
        //     while(!st.isEmpty() && arr[i]> arr[st.peek()])st.pop();
        //     if(st.isEmpty())st.push(i);
        //     rge[i]=arr[st.peek()]-arr[i];
        //     max= max<rge[i]?rge[i]:max;
        // }
        // return max;

        int minPrice = arr[0];
        int maxProfit = 0;
        for( int i = 1 ; i <  n ; i++){
            minPrice = Math.min(minPrice , arr[i]);
            int profit = arr[i]- minPrice;
            maxProfit= Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
