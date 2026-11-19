class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(0,nums,0,target,ans,new ArrayList<>());
        return ans;
        
    }

    public void helper( int id , int[] arr, int sum,int target,List<List<Integer>> ans, List<Integer> ls){
        if(id==arr.length){
           if( sum==target){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(sum>target)return;

        ls.add(arr[id]);
        sum+=arr[id];
        helper(id, arr, sum,target,ans,ls);
        ls.remove(ls.size()-1);
        sum-=arr[id];
        helper(id+1, arr, sum,target,ans,ls);


    }
}
