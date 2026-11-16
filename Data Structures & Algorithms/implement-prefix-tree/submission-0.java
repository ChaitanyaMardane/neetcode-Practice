class PrefixTree {
    private TrieNode root;
     public PrefixTree() {
        root = new TrieNode();
    }
   
    public void insert(String word) {
         TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if(current.children[idx]==null){
                current.children[idx] =new  TrieNode();
            }
            
            current = current.children[idx];
        }
           current.isEnd = true;
       

    }
    
    public boolean search(String word) {
         TrieNode node = traverse(word);
          return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        return traverse(prefix)!=null;
    }
    public TrieNode traverse(String word){
        TrieNode  current = root;
        for( char ch : word.toCharArray()){
            int idx = ch-'a';
            if(current.children[idx]==null)return null;
            current = current.children[idx];
        }
        return current;

    }
}
class TrieNode {
        TrieNode[] children = new TrieNode[26]; // 'a' to 'z'
        boolean isEnd;
    }

