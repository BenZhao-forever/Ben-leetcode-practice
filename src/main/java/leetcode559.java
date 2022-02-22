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
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        Node levelend = root.children.get(root.children.size() - 1);
        while (!q.isEmpty()){
            Node temp = q.pop();
            q.addAll(temp.children);
            if (temp == levelend) {
                depth++;
                levelend = q.getLast();
            }
        }
        return depth;
    }
}
