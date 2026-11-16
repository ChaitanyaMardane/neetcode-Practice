class Solution {
    class Pair{
        int x , y ;
        public Pair(int x , int y ){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        Queue<Pair> q= new ArrayDeque<>();
        for(int i= 0 ; i< m ; i++){
            for(int j= 0 ; j< n ; j++){
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    q.offer(new Pair(i,j));
                }
            }

        }
        int[] dr = {0,0,1,-1};
        int[] dc = {1,-1,0,0};
        int min =-0; 
        while(!q.isEmpty()){
            int size =q.size();
        System.out.println(size);

            for(int i =0; i < size ; i++){
                Pair p = q.poll();
                for( int j =0 ; j< 4 ; j++){
                    int nr = p.x + dr[j];
                    int nc = p.y + dc[j];
                    if(nr>=0 && nc>=0 && nr< grid.length && nc< grid[0].length && grid[nr][nc]==1 && !vis[nr][nc]){
                        vis[nr][nc]=true;
                        q.offer(new Pair(nr,nc));
                    }
                }
            }
            min++;


        }
        for(int i= 0 ; i< m ; i++){
            for(int j= 0 ; j< n ; j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    return -1;
                }
            }

        }
        
        return min==0?0:min-1;
        
    }
}