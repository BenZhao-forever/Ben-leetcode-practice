import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
class TreeNodeTest {

    @Test
    void create() {
        String[] list1 = {"3", "9", "20", "#", "#", "15", "7"};
        TreeNode l1 = TreeNode.create(list1);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        String[] list2 = {"4", "2", "#", "1", "5", "#", "#", "#", "3"};
        TreeNode l2 = TreeNode.create(list2);

        assertEquals(root.val, l1.val);
        assertEquals(root.left.val, l1.left.val);
        assertEquals(root.right.val, l1.right.val);
        assertEquals(root.right.left.val, l1.right.left.val);
        assertEquals(root.right.right.val, l1.right.right.val);
    }

    @Test
    void testToString() {
        String[] list1 = {"3", "9", "20", "#", "#", "15", "7"};
        String ans = "3, 9, 20, #, #, 15, 7";
        TreeNode l1 = TreeNode.create(list1);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(ans, root.toString());
    }
}