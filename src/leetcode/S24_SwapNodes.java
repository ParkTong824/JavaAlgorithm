package leetcode;

public class S24_SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        return recursion(head,head.next);
    }

    ListNode recursion(ListNode curr,ListNode next) {
        if(curr == null){
            return null;
        }
        if(curr != null && next == null) {
            return curr;
        }
        ListNode reverse = null;
        if(next.next == null ){
            reverse = null;
        } else {
            reverse = recursion(next.next,next.next.next);
        }
        next.next = curr;
        curr.next = reverse;
        return next;

    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }