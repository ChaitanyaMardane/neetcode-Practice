class Solution {
    public int characterReplacement(String s, int k) {
        int l=0 ,r =0;
         int n = s.length();
         int[] ch = new int[26];
         int res = 0;
         while(  r < n){
             char curr = s.charAt(r);
             ch[curr - 'A']++;
             int maxFI =0;
             
             for(int x =0;x <26; x++){
                 maxFI=ch[maxFI]>ch[x]?maxFI:x;
             }
             System.out.println("maxFI : "+maxFI);
             if(r-l+1  -ch[maxFI] <= k){
                 res=Math.max(res,r-l+1);
             } else  {
                 while(l<r &&  r - l + 1 - ch[maxFI]  > k){
                     ch[s.charAt(l++)-'A']--;
                     for(int x =0;x <26; x++){
                 maxFI=ch[maxFI]>ch[x]?maxFI:x;
             }
                 }
                 res=Math.max(res,r-l+1);
             }
             r++;
         }
         return res;
    }
}
