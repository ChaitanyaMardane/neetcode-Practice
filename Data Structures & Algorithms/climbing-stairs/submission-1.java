class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Dp(n , dp);
        
        
    }
    public  int Dp(int n , int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = Dp(n-1 ,dp )+Dp(n-2 , dp );
    }
}
