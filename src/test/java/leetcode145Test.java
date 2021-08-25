import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode145Test {

    @Test
    void postorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> list = leetcode145.postorderTraversal(root);
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}