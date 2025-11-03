package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> children = new HashMap<>();
    private Boolean isFinish = false;

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public Boolean getFinish() {
        return isFinish;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public void setFinish(Boolean finish) {
        isFinish = finish;
    }
}
