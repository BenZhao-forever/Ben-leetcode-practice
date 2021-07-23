/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
public class leetcode814 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/binary-tree-pruning/", 814);
    }
    public static TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }
    public static boolean containsOne(TreeNode node) {
        if (node == null) {
            return false;
        }
        boolean a1 = containsOne(node.left);
        boolean a2 = containsOne(node.right);
        if (!a1) {
            node.left = null;
        }
        if (!a2) {
            node.right = null;
        }
        return node.val == 1 || a1 || a2;
    }
}
