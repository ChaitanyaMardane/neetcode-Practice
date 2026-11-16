class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] charS= new char[s.length()];
        char[] charT= new char[s.length()];
        int i=0;
        for ( i =0 ; i < s.length(); i++){
            charS[i]=s.charAt(i);
            charT[i]=t.charAt(i);
            
        }
        System.out.println(Arrays.toString(charS));
        System.out.println(Arrays.toString(charT));
        Arrays.sort(charS);
        Arrays.sort(charT);

        for(  i =0 ; i < s.length(); i++){
            if(charS[i]!=charT[i]) return false;
        }
        return true;
    }
}
