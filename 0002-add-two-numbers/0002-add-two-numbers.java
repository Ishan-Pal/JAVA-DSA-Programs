class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int carr = 0;

    while (l1 != null || l2 != null || carr > 0) {
      if (l1 != null) {
        carr += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        carr += l2.val;
        l2 = l2.next;
      }
      curr.next = new ListNode(carr % 10);
      carr /= 10;
      curr = curr.next;
    }

    return dummy.next;
  }
}
