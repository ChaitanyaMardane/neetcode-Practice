class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int prev2=arr[0];
        int prev1 =Math.max(arr[0],arr[1]);

        for( int i = 2 ; i < n ;i++){
            int curr =Math.max(prev2+arr[i],prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;

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
