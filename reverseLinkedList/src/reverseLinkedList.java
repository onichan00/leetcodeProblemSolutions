public class reverseLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static void main(String[] args) {
        ListNode node = new ListNode(5,new ListNode(6,new ListNode(4,new ListNode(9))));
        reverseList(node);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while(current != null) {
            ListNode next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
