class Solution {
    public  class Kclose  implements Comparable<Kclose>{
        long dist ;
        int x  , y ;
        public Kclose(long dist , int x , int y){
            this.dist = dist;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Kclose obj) {
            return (int)(this.dist - obj.dist);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Kclose> pq = new PriorityQueue<>(Collections.reverseOrder());
        for( int i =0 ; i< points.length; i++){
            int a = points[i][0], b =points[i][1];
            long dist = a*a+b*b;
            pq.add(new Kclose(dist, a,b));
            if(pq.size()>k) pq.remove();

        }
        int[][] ans = new int[k][2];
        for( int i= 0; i< k ;i++){
            Kclose p = pq.remove();
            ans[i][0]= p.x;
            ans[i][1]= p.y;
        }
        return ans;

    }
}
