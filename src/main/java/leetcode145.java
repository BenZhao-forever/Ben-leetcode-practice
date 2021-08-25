import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode145 {
//    public static void main(String[] args) {
//
//    }
//    public static List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        helper(root, list);
//        return list;
//    }
//    public static void helper(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        helper(root.left, list);
//        helper(root.right, list);
//        list.add(root.val);
//    }
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/binary-tree-postorder-traversal/", 145);
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root .left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                list.add(root.val);
                prev = root;
                root = null;
            }else {
                stack.push(root);
                root = root.right;
            }
        }
        return list;
    }
}
