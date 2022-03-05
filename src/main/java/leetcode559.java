import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode559 {
    public static void main(String[] args) {

    }
    static class Node {
        public int val;
        public List<Node> children;

        public Node () {}
        public Node (int _val) {
            val = _val;
        }

        public Node (int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int size = 0;
        while (!q.isEmpty()){
            Node temp = q.peek();
            q.addAll(temp.children);
            for (Node n: temp.children) {

            }
        }
        return depth;
    }
}
