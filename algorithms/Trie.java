package algorithms;


public class Trie {
    TrieNode root = new TrieNode();

    public void insert(String word) {
        if (word == null) return;
        TrieNode current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            current = current.getChildren().computeIfAbsent(c, k -> new TrieNode());
        }
        current.setFinish(true);
    }
    // ---------- 간단 테스트 ----------
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("apply");
        trie.insert("앱"); // 유니코드 단어도 OK

        System.out.println(trie);

    }
}
