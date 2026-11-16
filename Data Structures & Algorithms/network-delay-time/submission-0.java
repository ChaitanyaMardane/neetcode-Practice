class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int ans = 0 ;
            int[] dist = new int[n+1];
            Arrays.fill(dist, (int)(1e9));
            ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
            for( int i = 0 ; i <=n; i++) adj.add(new ArrayList<>());
            
            for( int[] edge : times){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                adj.get(u).add(new int[]{v,w});
            }

            PriorityQueue<int[]> q= new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));

            q.offer(new int[]{k,0});
            dist[k]=0;

            while(!q.isEmpty()){
                int[] curr = q.poll();

                int u = curr[0];
                int udist = curr[1];
                

                for( int[] edge : adj.get(u) ){
                    int v = edge[0];
                    int vw = edge[1];
                    if(dist[v]> dist[u]+ vw){
                        dist[v]= dist[u] + vw;
                        
                        q.offer(new int []{v,dist[v]});
                    }
                   
                }
            } 
            System.out.println(Arrays.toString(dist));
            for( int i = 1 ; i <= n ; i++){
                if(dist[i]== (int)(1e9))return -1;
                else ans = Math.max(dist[i],ans);
            }
            return ans;
    }
}