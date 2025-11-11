package algorithms;

public class TreeNode {
    private TreeNode right;
    private TreeNode left;
    private String value ;

    public TreeNode(String value) {
        this.value = value;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public String getValue() {
        return value;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
