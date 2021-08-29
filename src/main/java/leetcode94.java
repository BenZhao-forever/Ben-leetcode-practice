import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode94 {
//    public static void main(String[] args) {
//
//    }
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        helper(list, root);
//        return list;
//    }
//    public static void helper (List<Integer> list, TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        helper(list, root.left);
//        list.add(root.val);
//        helper(list, root.right);
//    }
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/binary-tree-inorder-traversal/", 94);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }else {
                TreeNode node = stack.pop();
                list.add(node.val);
                temp = node.right;
            }

        }
        return list;
    }
}
