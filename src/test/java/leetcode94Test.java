import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode94Test {

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> list = leetcode94.inorderTraversal(root);
        for(Integer n : list) {
            System.out.println(n + ", ");
        }
    }
}