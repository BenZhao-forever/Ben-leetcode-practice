/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class jianzhi54 {
    public static void main(String[] args) {
        readMeSet.addJianZhi("https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/", 54);
    }
    private int result;
    private int k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        largest(root);
        return result;
    }
    public void largest(TreeNode root) {
        if (root == null) {
            return;
        }
        largest(root.right);
        if (--this.k == 0) {
            this.result = root.val;
            return;
        }
        largest(root.left);
    }
}
