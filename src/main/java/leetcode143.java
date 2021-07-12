import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode143 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reorder-list/", 143);
    }
    public static void reorderList(ListNode head) {
        int magic = 2;
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode temphead = head;
        while (temphead != null) {
            list.add(temphead);
            temphead = temphead.next;
        }
        temphead = head;
        for (int i = 0; i < list.size() / magic; i++) {
            if (i != 0) {
                temphead.next = list.get(i);
                temphead = temphead.next;
            }
            temphead.next = list.get(list.size() - 1 - i);
            temphead = temphead.next;
        }
        if (list.size() % magic == 1) {
            temphead.next = list.get(list.size() / 2);
            temphead = temphead.next;
        }
        temphead.next = null;
    }
}
