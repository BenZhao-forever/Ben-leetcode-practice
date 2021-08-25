import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/8/24
 * Project: Ben-leetcode-practice
 */
class leetcode144Test {

    @Test
    void preorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> list = leetcode144.preorderTraversal(root);
        for (Integer i : list) {
            System.out.println(i + ", ");
        }
    }
}