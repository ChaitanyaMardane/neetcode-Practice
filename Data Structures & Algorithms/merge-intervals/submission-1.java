class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[] >range = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        range.add(intervals[0]);

        for( int[] interval : intervals){
            int[] last = range.get(range.size()-1);
            if(last[1]>= interval[0]){
                last[0]=Math.min(last[0],interval[0]);
                last[1]=Math.max(last[1],interval[1]);
            }
            else range.add(interval);
        }

        int[][] ans = new int[range.size()][2];
        for(int i =0;i< range.size(); i++){
            ans[i]=range.get(i);
        }
        return ans;
    }
}
