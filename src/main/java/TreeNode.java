import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}

    @Override
    public String toString() {
        return toString(this);
    }

    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static TreeNode create(String[] value) {
        TreeNode[] tree = new TreeNode[value.length];
        for (int i = 0; i < value.length; i++) {
            if (!"#".equals(value[i])) {
                tree[i] = new TreeNode(Integer.parseInt(value[i]));
            }else {
                if (i > 0) {
                    if (i % 2 == 1) {
                        tree[(i-1) / 2].left = tree[i];
                    }else {
                        tree[(i-2) / 2].right = tree[i];
                    }
                }
            }
        }
        return tree[0];
    }
    public static String toString(TreeNode root) {
        if(root == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.add(list.get(i).left);
                list.add(list.get(i).right);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == null) {
                list.remove(i);
            }else {
                break;
            }
        }
        for (TreeNode t: list) {
            if (t != null) {
                stringBuilder.append(t.val).append(", ");
            }else {
                stringBuilder.append("#, ");
            }
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
