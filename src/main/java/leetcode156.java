
/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
public class leetcode156
{
    public static void main(String[] args) {

    }
    public static TreeNode upsideDownBinaryTree(TreeNode root) {
        return null;
    }
    public static TreeNode reverseLeft(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }
        TreeNode pre = null;
        TreeNode next = root.left;
        while (next != null) {
            root.left = pre;
            pre = root;
            root = next;
            next = next.left;
        }
        root.left = pre;
        return root;
    }
    public static TreeNode floatUp(TreeNode root) {
        return null;
    }
    public static TreeNode reverseTree(TreeNode root) {
        return null;
    }
}
