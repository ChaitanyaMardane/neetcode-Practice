class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb = new StringBuilder();
       for(String s : strs){
        sb.append(s.length()).append('#').append(s);
       }
       System.out.println(sb);
       return sb.toString();

    }

    public List<String> decode(String str) {
            List<String> ans = new ArrayList<>();
            int  i=0;
            int n = str.length();
            while(i<n){
                int hashIndex = str.indexOf('#',i);
                int length = Integer.parseInt(str.substring(i,hashIndex));
                int start = hashIndex+1;
                
                ans.add(str.substring(start  ,start+length));
                i = hashIndex+1+length;
            }
            return ans;
    }
}
