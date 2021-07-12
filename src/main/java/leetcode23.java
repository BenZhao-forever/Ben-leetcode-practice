public class leetcode23 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/merge-k-sorted-lists/", 23);
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        while (lists.length != 1) {
            int newsize = lists.length / 2;
            newsize += lists.length % 2;
            ListNode[] newlists = new ListNode[newsize];
            for (int i = 0; i < newsize; i++) {
                if (i *2 == lists.length - 1) {
                    newlists[i] = lists[i * 2];
                }else {
                    newlists[i] = mergeTwoLists(lists[i * 2], lists[i *2 + 1]);
                }
            }
            lists = newlists;
        }
        return lists[0];
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode answer = new ListNode();
        ListNode tempanswer = answer;
        while (true) {
            if (l1 == null) {
                tempanswer.next = l2;
                break;
            }
            if (l2 == null) {
                tempanswer.next = l1;
                break;
            }
            if (l1.val > l2.val) {
                tempanswer.next = new ListNode(l2.val);
                tempanswer = tempanswer.next;
                l2 = l2.next;
            }else {
                tempanswer.next = new ListNode(l1.val);
                tempanswer = tempanswer.next;
                l1 = l1.next;
            }
        }
        return answer.next;
    }
}
