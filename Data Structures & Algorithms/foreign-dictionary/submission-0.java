class Solution {
    public String foreignDictionary(String[] words) {
        Set<Character> set = new HashSet<>();

        for( String str : words)for(char c : str.toCharArray())set.add(c);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i = 0 ; i < 26 ;i++)adj.add(new ArrayList<>());
        int[] indegree = new int[26];

        for( int i = 0 ; i < words.length-1; i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int j = 0; 
            int minLen = Math.min(s1.length(),s2.length());
            while(j<minLen && s1.charAt(j)==s2.charAt(j)){
                set.add(s1.charAt(j));
                j++;
            }
            
            if(j==minLen){
                if(s1.length()>s2.length()) return "";
                continue;
            }
           adj.get((int)(s1.charAt(j)-'a')).add((int)(s2.charAt(j)-'a'));
          
        
        }
       
       for(ArrayList<Integer> edge : adj){
            if(edge.size()>0){
                for( int node : edge){
                    indegree[node]++;
                }
            }
       }
        StringBuilder ans = new StringBuilder();

       Queue<Integer> q  = new ArrayDeque<>();
       for( int node  = 0 ; node < 26 ; node++){
        if(indegree[node]==0 && set.contains((char)('a'+node))){
            q.offer(node);
            ans.append((char)('a' + node));

        }
       }

       while(!q.isEmpty()){
            int curr = q.poll();

            for( int nodes : adj.get(curr)){
                indegree[nodes]--;
                if(indegree[nodes]==0){
                    q.offer(nodes);
            ans.append((char)('a' + nodes));

                }
            }
       }

        if(ans.length()!=set.size())return "";

      

        return ans.toString() ;
     }
}
