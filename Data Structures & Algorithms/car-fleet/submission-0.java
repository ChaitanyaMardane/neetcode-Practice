class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> pairs = new ArrayList<>();
        int n =  speed.length;
        for (int i = 0 ; i < position.length ;i++){
            pairs.add(new int[]{position[i],speed[i]});
        }
        pairs.sort((e1,e2) -> e1[0]-e2[0]);
        
        int fleet = n;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(n-1);
        for( int i = n-2;i>=0;i--){
            int top=st.peek();
            float t1=(float)((target-pairs.get(top)[0])/(float)pairs.get(top)[1]);
            float t2=(float)((target-pairs.get(i)[0])/(float)pairs.get(i)[1]);
            if(t2>t1){
                st.pop();
                st.push(i);

            }else{
                fleet--;
            }
        }
        return fleet;
    }
}