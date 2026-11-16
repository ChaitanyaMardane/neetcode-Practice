class WordDictionary {
    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.child[i] == null)
                curr.child[i] = new Node();
            curr = curr.child[i];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node curr = root;
        return dfs(word.toCharArray(),0, curr);
    }

    public boolean dfs(char[] word, int idx, Node root) {
        if (root == null)
            return false;
        if (idx == word.length)
            return root.end;

        char c = word[idx];
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (root.child[i] != null && dfs(word, idx + 1, root.child[i]))
                    return true;
            }
            return false;
        }

        return dfs(word, idx + 1, root.child[c - 'a']);

    }

}
class Node {
    Node[] child = new Node[26];
    boolean end = false;
}
