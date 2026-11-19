class Solution {
    public int rob(int[] arr) {
          int n = arr.length;
          if(n==1) return arr[0];
          int[] dp = new int[n];
          int case1= helper(1,n-1,arr,dp);
          Arrays.fill(dp,0);
          int case2 = helper(0,n-2,arr,dp);
          return Math.max(case1,case2);
    }
       public int  helper(int id , int s,int[] arr, int[] dp){
        if(id>s ) return 0;
        if(dp[id]!=0) return dp[id];
        int curr = helper(id+2,s,arr,dp)+arr[id];
        int prev = helper(id+1,s,arr,dp);
        return dp[id]= Math.max(curr,prev);
    }
}
