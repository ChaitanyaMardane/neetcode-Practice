class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0 , j= 0 ;
        int maxLen=0;
        while ( j< s.length()&& i<=j){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j)) && !set.isEmpty()){
                 set.remove(s.charAt(i));
                 i++;
                 }
            }
            set.add(s.charAt(j));
            j++;
            maxLen= Math.max(maxLen,j-i);
        }
        return maxLen;
    }
}
