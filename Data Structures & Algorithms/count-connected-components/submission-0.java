class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] vis = new  boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i =0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int cnt = 0;
        for( int i = 0 ; i < n ; i++){
            if(!vis[i]){
                dfs(i,adj , vis);
                cnt++;
            }
        }
        return cnt;
    }
    public  void dfs(int node ,ArrayList<ArrayList<Integer>> adj, boolean[] vis ){
        vis[node] = true;
        for(int x : adj.get(node)){
            if(!vis[x])dfs(x,adj,vis);
        }
    }
}
