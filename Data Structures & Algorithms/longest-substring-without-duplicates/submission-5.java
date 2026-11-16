class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ch = new int[128];
        int n = s.length();
        int j = 0;
        int cnt =0;
        int max=0;
        for(int i = 0 ; i <n ; i++ ){
            ch[s.charAt(i)]++;
            cnt++;
            while(ch[s.charAt(i)]>1 && j<i){
                ch[s.charAt(j)]--;
                j++;
                cnt--;
            }
            max=cnt>max?cnt:max;

        }
      
        return max;
    }
}
