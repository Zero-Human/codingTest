package algorithms;

import java.util.*;

public class DFS {
    // 이진트리의 dfs 반복하는 방식(preorder)
    public static void dfsIterative(TreeNode root){
        if(root ==null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.getValue());
            if(node.getRight() != null){
                stack.push(node.getRight());
            }
            if(node.getLeft() != null){
                stack.push(node.getLeft());
            }
        }
    }
    // 이진트리의 dfs 재귀하는 방식(preorder)
    public static void dfsRecursive(TreeNode node){
        if(node != null){
            System.out.println(node.getValue());
            dfsRecursive(node.getLeft());
            dfsRecursive(node.getRight());
        }

    }
    // 그래프의 dfs 방식
    public static void dfsGraph(Map<String, List<String>> graph, String node, Set<String> visited){
        if(visited.contains(node)){
            return;
        }
        System.out.println(node);
        visited.add(node);
        for (String neighbor : graph.get(node)){
            dfsGraph(graph, neighbor, visited);
        }
    }



    public static void main(String[] args) {
        TreeNode leaf1 = new TreeNode("leaf1");
        TreeNode leaf2 = new TreeNode("leaf2");
        TreeNode leaf3 = new TreeNode("leaf3");
        TreeNode leaf4 = new TreeNode("leaf4");
        TreeNode leaf5 = new TreeNode("leaf5");
        TreeNode leaf6 = new TreeNode("leaf6");
        leaf1.setLeft(leaf2);
        leaf1.setRight(leaf3);
        leaf2.setLeft(leaf4);
        leaf2.setRight(leaf5);
        leaf4.setRight(leaf6);
        dfsIterative(leaf1);
        System.out.println("----------------");
        dfsRecursive(leaf1);
        System.out.println("-----------------");
        Map<String, List<String>> graph = Map.of("A",List.of("B","C")
                ,"B",List.of("D")
                ,"C",List.of("E")
                ,"D",new ArrayList<>()
                ,"E",new ArrayList<>());
        dfsGraph(graph,"A",new HashSet<>());
    }
}
