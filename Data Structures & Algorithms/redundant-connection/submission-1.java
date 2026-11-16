class Solution {
     class DSU{
        public int[] parent ;
        public int[] size ;
        
        public DSU(int n){
            size = new int[n];
            parent = new int[n];
            for(int i = 0; i < n ; i++){
                parent[i]=i;
                size[i]=1;
            }
        }
     
     public int find(int node ){
         if(node!=parent[node]){
             parent[node]=find(parent[node]);
         }
         return parent[node];
     }
     
     public void union(int u , int v){
         int ulp_u = find(u);
         int ulp_v=find(v);
         if(ulp_u==ulp_v)return;
         if(size[ulp_u]<=size[ulp_v]){
             parent[ulp_u]=ulp_v;
             size[ulp_v]+=size[ulp_u];
         }else{
             parent[ulp_v]=ulp_u;
             size[ulp_u]+=size[ulp_v];
         }
        //  return true;
     }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n= edges.length;
        DSU dsu = new DSU(n+1);
        for( int[] edge : edges ){
            int u  = edge[0];
            int v  = edge[1];
            if(dsu.find(u)==dsu.find(v))return new int[]{u,v};
            else{
                    dsu.union(u,v);
            }
        }
        return new int[]{};
    }
}