import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode100Test {

    @Test
    void isSameTree() {
        TreeNode t1 = TreeNode.create(new String[] {"1", "2", "3"});
        TreeNode t2 = TreeNode.create(new String[] {"1", "2", "3"});
        TreeNode t3 = TreeNode.create(new String[] {"1", "2"});
        TreeNode t4 = TreeNode.create(new String[] {"1", "#", "2"});
        TreeNode t5 = TreeNode.create(new String[] {"1", "2", "1"});
        TreeNode t6 = TreeNode.create(new String[] {"1", "1", "2"});
        assertTrue(leetcode100.isSameTree(t1, t2));
        //assertFalse(leetcode100.isSameTree(t3, t4));
        assertFalse(leetcode100.isSameTree(t5, t6));
    }
}