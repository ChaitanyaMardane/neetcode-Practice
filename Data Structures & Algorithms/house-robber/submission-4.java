class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        dp[0]=arr[0];
        dp[1] =Math.max(arr[0],arr[1]);

        for( int i = 2 ; i < n ;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        return dp[n-1];

        // return helper(n-1,arr,dp);

        
    }
    public int  helper(int id , int[] arr, int[] dp){
        if(id==0)return arr[0];
        if(id==1)return Math.max(arr[0],arr[1]);
        if(dp[id]!=0) return dp[id];
        int curr = helper(id-2,arr,dp)+arr[id];
        int prev = helper(id-1,arr,dp);
        return dp[id]= Math.max(curr,prev);
    }
}
