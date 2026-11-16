class Solution {
    class Pair{
        int dist;
        String str;
        public Pair(String str, int dist){
            this.dist= dist;
            this.str= str;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(beginWord,1));
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))return 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
                //  System.out.println(p.str);

            if(p.str.equals(endWord)) {
                 System.out.println("Path found " + p.dist);
                return p.dist;
            }
            char[] curr = p.str.toCharArray();
            for( int i=0; i<curr.length; i++){
                char org = curr[i];
                for(char ch ='a' ; ch<='z';ch++){
                    if(ch==org)continue;
                    curr[i]=ch;
                    String replaced = new String(curr);
                    if(set.contains(replaced)){
                        q.offer(new Pair(replaced, p.dist+1));
                        System.out.println(set+ " "+replaced);
                        set.remove(replaced);
                    }
                }
                curr[i]=org;
            }

        }

        return 0;
    }
    
}
