class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int m = grid.length;
        int n =grid[0].length;
        boolean[][] isVisit= new boolean[grid.length][grid[0].length];
      
    int maxArea=0;
       for( int i = 0; i< m;i++ ){
        for(int j=0; j< n ;j++)
           if(!isVisit[i][j] && grid[i][j]==1){
              
            //   System.out.println(cnt);
            
            int area = bfs(i,j,isVisit,grid, 0);
              maxArea= Math.max(area,maxArea);
           }
       }
       return maxArea;
    }

      public static int bfs(int r,int c , boolean[][] isVisit,int[][] grid, int area){
        isVisit[r][c]=true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
        area++;

            q.remove();
            for(int dr=-1;dr<=1;dr++){
                 for(int dc=-1;dc<=1;dc++){
                    int nrow=row+dr;
                    int ncol=col+dc;
                    if(nrow>=0 && nrow<grid.length&& ncol>=0&& ncol<grid[0].length
                    && Math.abs(dr)!=Math.abs(dc) &&grid[nrow][ncol]==1 &&  !isVisit[nrow][ncol]){
                        isVisit[nrow][ncol]=true;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }

        }
        return area;

    }
    public static class Pair{
        int first;
        int second;
        public Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }
}
