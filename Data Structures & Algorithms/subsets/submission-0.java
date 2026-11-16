class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        helper( arr , new ArrayList<>(),ans, 0);
        return ans;
    }
    public void  helper( int[] arr ,  ArrayList<Integer> ls,  List<List<Integer>> ans, int id){
        
        if(id==arr.length){
            ans.add(new ArrayList<>(ls));
            return;
        }

        ls.add(arr[id]);
        helper(arr, ls, ans,id+1);
        ls.removeLast();
        helper(arr, ls, ans,id+1);
    }
}
