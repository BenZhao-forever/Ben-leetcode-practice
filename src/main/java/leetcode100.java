/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode100 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/same-tree/", 100);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }else if (p == null || q == null) {
            return false;
        }else if (p.val != q.val) {
            return false;
        }else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
