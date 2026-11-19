class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        genSubset( 0, arr ,new ArrayList<>(), ans);
        return ans;
        
    }

    public void genSubset(int id , int[] arr , List<Integer> ls ,List<List<Integer>> ans ){
        if( id == arr.length){
            ans.add(new ArrayList<>(ls));
            return ;
        }
        ls.add(arr[id]);
        genSubset(id+1, arr , ls , ans);
        ls.removeLast();
        genSubset(id+1,arr,ls,ans);
    }
}
