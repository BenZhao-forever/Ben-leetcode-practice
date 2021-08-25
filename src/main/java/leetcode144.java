import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/8/24
 * Project: Ben-leetcode-practice
 */
public class leetcode144 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/binary-tree-preorder-traversal/",144);
    }
//    public static List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        helper(root, list);
//        return list;
//    }
//    public static void helper(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        list.add(root.val);
//        helper(root.left, list);
//        helper(root.right, list);
//    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.empty() || temp != null) {
            while (temp != null) {
                list.add(temp.val);
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            temp = temp.right;
        }
        return list;
    }
}
