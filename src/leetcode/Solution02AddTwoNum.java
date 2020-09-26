package leetcode;

public class Solution02AddTwoNum {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer ;
        ListNode answerNode = new ListNode();
        int count = 0;
        while (true) {
            if (answerNode.val==0){
                answerNode.val = l1.val+l2.val;
            }else {
                answerNode.val = l1.val+l2.val+1;
            }

            if (answerNode.val>=10){
                answerNode.val=answerNode.val%10;
                answerNode.next=new ListNode(1);;
            }else {
                answerNode.next=new ListNode(0);
            }
            if (l1.next!=null||l2.next!=null){
                answerNode = answerNode.next;
                l1 = l1.next;
                l2 = l2.next;
            }else {
                break;
            }
        }

        return answerNode;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val=2;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode();
        l2.val=5;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode answer = addTwoNumbers(l1,l2);
        System.out.println(answer.val);
    }

  /*
  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer ;
        ListNode answerNode = new ListNode();
        int count = 0;
        while (true) {
            if (answerNode.val==0){
                answerNode.val = l1.val+l2.val;
            }else {
                answerNode.val = l1.val+l2.val+1;
            }

            if (answerNode.val>=10){
                answerNode.val=answerNode.val%10;
                answerNode.next=new ListNode(1);;
            }else {
                answerNode.next=new ListNode(0);
            }
            if (l1.next!=null||l2.next!=null){
                answerNode = answerNode.next;
                l1 = l1.next;
                l2 = l2.next;
            }else {
                break;
            }
        }
        while (true){
            answer = new ListNode(answerNode.val);

        }
        return answerNode;
    }
   */
}
