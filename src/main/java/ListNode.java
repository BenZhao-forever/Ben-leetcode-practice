class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    public static ListNode create(int[] list) {
        ListNode head = new ListNode();
        ListNode temphead = head;
        for (int j : list) {
            temphead.next = new ListNode(j);
            temphead = temphead.next;
        }
        return head.next;
    }
    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
    public static String toString(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return stringBuilder.toString();
        }
        while (head.next != null) {
            stringBuilder.append(head.val);
            stringBuilder.append("->");
            head = head.next;
        }
        stringBuilder.append(head.val);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        ListNode temp = this;
        StringBuilder stringBuilder = new StringBuilder();
        while (temp.next != null) {
            stringBuilder.append(temp.val);
            stringBuilder.append("->");
            temp = temp.next;
        }
        stringBuilder.append(temp.val);
        return stringBuilder.toString();
    }
}