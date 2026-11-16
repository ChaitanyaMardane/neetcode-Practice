class Solution {
    class Pair{
        int d,x,y;

        
        public Pair(int x, int y, int d){
            this.x=x;
            this.y  = y ;
            this.d = d;
        }
    }
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair>  q = new ArrayDeque<>();
        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j<m ; j++){
                if(grid[i][j]==0  ){
                   q.offer(new Pair(i,j,0));
                }
            }
        }
        int[] dr = {1,0,-1,0};
        int[] dc = {0,-1,0,1};
        while(!q.isEmpty()){
            Queue<Pair> qc = new ArrayDeque<>();
            int dist=0;
            boolean[][] vis = new boolean[n][m];

            qc.offer(q.poll());
            Pair temp = qc.peek();
            vis[temp.x][temp.y]=true;
            while(!qc.isEmpty()){
                    Pair p = qc.poll();
                    dist=p.d;
                    for(int i = 0 ; i<4 ; i++){
                        int nr = p.x+dr[i];
                        int nc = p.y+dc[i];
                        if(nr>=0&& nr<n && nc>=0 &&nc<m &&grid[nr][nc]>0 && !vis[nr][nc]){
                            vis[nr][nc]=true;
                            grid[nr][nc]=Math.min(grid[nr][nc],dist+1);
                            qc.offer(new Pair(nr,nc,p.d+1));
                        }
                    }
            }
        }
    }
    
}
