
public class addTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4,new ListNode(9))));
        solution(l1,l2);
    }
    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        int carry = 0;

        while(l1 != null || l2 != null){
            if (l1 == null){
                l1 = new ListNode(0);
            }
            if (l2 == null){
                l2 = new ListNode(0);
            }
            tail.next = new ListNode(l1.val + l2.val);

            if (carry >0){
                tail.next.val += carry;
                carry =0;
            }

            if (tail.next.val >= 10){
                carry = 1;
                tail.next.val = tail.next.val - 10;
            }

            l1 = l1.next;
            l2 = l2.next;
            tail = tail.next;
        }

        if(carry >0 ){
            tail.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
