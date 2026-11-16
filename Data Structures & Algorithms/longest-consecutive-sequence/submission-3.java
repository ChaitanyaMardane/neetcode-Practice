class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if(n<=1)return n;
        Arrays.sort(arr);
        int cnt = 0,buffer;
        int maxCount =0;
        buffer = arr[0];
        // System.out.println(Arrays.toString(arr));
        for(int x :arr){
            if(buffer==x)continue;
            if(buffer+1==x){
                cnt++;
            maxCount=(cnt>maxCount)? cnt :maxCount;

            }

            else {
                
                cnt=0;
            }
            buffer=x;
            // System.out.println(cnt);
        }
        return maxCount+1;
        
    }
}
