/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode237 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/delete-node-in-a-linked-list/", 237);
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
