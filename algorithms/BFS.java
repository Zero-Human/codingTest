package algorithms;

import java.util.*;

public class BFS {

    // 그래프인 경우 순환하지 않도록 방문한 것은 방문 안하도록 확인한다
    public static void bfs(Map<String, List<String>> graph,String start){
        Set<String> visited = new HashSet<>();
        List<String> queue = new ArrayList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            // 방문할 노드 확인
            String node = queue.get(0);
            queue.remove(0);
            // 기존에 방문했던 노드면 패스
            if (visited.contains(node)){
                continue;
            }
            // 큐 소비
            System.out.println(node);
            // 방문한 노드에 추가
            visited.add(node);
            // 인접한 노드 확인
            for(String neighbor : graph.get(node)){
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }
    }
    public static void bfsTree(TreeNode root){
        // 노드가 없으면 리턴
        if(root == null){
            return;
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            // 방문할 노드 확인
            TreeNode node = queue.get(0);
            queue.remove(0);
            // 방문한 노드 소비
            System.out.println(node.getValue());
            // 왼쪽에 노드 있는지 확인
            if(node.getLeft() !=  null){
                queue.add(node.getLeft());
            }
            // 오른쪽에 노드 있는지 확인
            if(node.getRight() !=  null){
                queue.add(node.getRight());
            }
        }
    }


    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of("A",List.of("B","C")
                                                ,"B",List.of("D")
                                                ,"C",List.of("E")
                                                ,"D",new ArrayList<>()
                                                ,"E",new ArrayList<>());
        bfs(graph, "A");
        TreeNode leaf1 = new TreeNode("leaf1");
        TreeNode leaf2 = new TreeNode("leaf2");
        TreeNode leaf3 = new TreeNode("leaf3");
        TreeNode leaf4 = new TreeNode("leaf4");
        TreeNode leaf5 = new TreeNode("leaf5");
        leaf1.setLeft(leaf2);
        leaf1.setRight(leaf3);
        leaf3.setLeft(leaf4);
        leaf2.setRight(leaf5);
        bfsTree(leaf1);
    }

}
