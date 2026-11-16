class Solution {
    public int rob(int[] arr) {
        int n =arr.length;
        int[] dp= new int[n];
        return solve(arr,n-1,dp);
        
    }
    public int solve(int[] arr, int n, int[] dp){
        if(n==0)return arr[0];
        if(n==1) return Math.max(arr[0] , arr[1]);
        if(dp[n]!=0)return dp[n];
        return  dp[n]=Math.max(arr[n] + solve(arr,n-2,dp), solve(arr,n-1,dp));


    }
}
