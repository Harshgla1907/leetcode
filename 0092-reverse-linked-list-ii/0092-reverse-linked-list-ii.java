class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        ListNode nextNode = null;
        ListNode subListTail = curr;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode temp = curr.next;
            curr.next = nextNode;
            nextNode = curr;
            curr = temp;
        }
        prev.next = nextNode;
        subListTail.next = curr;

        return dummy.next;
    }
}