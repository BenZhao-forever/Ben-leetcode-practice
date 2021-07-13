import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode148 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/sort-list/", 148);
    }
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            ListNode temp = head.next;
            head.next = null;
            list.add(head);
            head = temp;
        }
        while (list.size() != 1) {
            List<ListNode> newlist = new ArrayList<>();
            int size = list.size() / 2;
            size += list.size() % 2;
            for (int i = 0; i < size; i++) {
                if (i * 2  == list.size() - 1) {
                    newlist.add(list.get(i * 2));
                }else {
                    newlist.add(merge(list.get(i * 2), list.get(i * 2 + 1)));
                }
            }
            list = newlist;
        }
        return list.get(0);
    }
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while (l1 != null || l2 != null) {
            if(l1 == null) {
                temp.next = l2;
                return ans.next;
            }
            if(l2 == null) {
                temp.next = l1;
                return ans.next;
            }
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}
