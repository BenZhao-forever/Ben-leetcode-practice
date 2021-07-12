/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode725 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/split-linked-list-in-parts/", 725);
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] answer = new ListNode[k];
        int size = 0;
        ListNode temp = new ListNode();
        temp.next = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int divide = size / k;
        int resume = size % k;
        for (int i = 0; i < k; i++) {
            int position = divide;
            if (i < resume - 1) {
                position++;
            }
            ListNode[] templist = split(head, position);
            answer[i] = templist[0];
            head = templist[1];
        }
        return answer;
    }
    public static ListNode[] split(ListNode head, int k) {
        if (head == null) {
            return new ListNode[2];
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        while (temphead != null && k != 0) {
            k--;
            temphead = temphead.next;
        }
        if (temphead == null) {
            return new ListNode[] {head, null};
        }
        ListNode newhead = temphead.next;
        temphead.next = null;
        return new ListNode[] {head, newhead};
    }
}
