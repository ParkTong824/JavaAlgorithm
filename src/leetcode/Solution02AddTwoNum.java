package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution02AddTwoNum {
    public static void main(String[] args) {
        ListNode exam1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode exam2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = new Solution02AddTwoNum().addTwoNumbers( exam1, exam2);
        while(true){
            System.out.print(result.val + " ");
            result = result.next;
            if(result == null)
                break;
        }
        ListNode exam3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode exam4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result2 = new Solution02AddTwoNum().addTwoNumbers( exam3, exam4);
        System.out.println();
        while(true){
            System.out.print(result2.val + " ");
            result2 = result2.next;
            if(result2 == null)
                break;
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        boolean l1IsNUll = false, l2IsNull = false;

        ListNode tempNode = resultNode;
        while(true){
            if(tempNode.next != null){
                tempNode = tempNode.next;
            }
            int sum = l1.val + l2.val + tempNode.val;
            int plusNum = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum % 10 : sum;
            tempNode.val = sum;
            tempNode.next = new ListNode(plusNum);

            l1IsNUll = checkNodeIsNull(l1);
            l2IsNull = checkNodeIsNull(l2);
            if(l1IsNUll && l2IsNull){
                if(tempNode.next.val == 0)
                    tempNode.next = null;
                break;
            }
        }

        return resultNode;
    }

    private boolean checkNodeIsNull(ListNode listNode){
        if(listNode.next == null){
            listNode.val = 0;
            return true;
        }else{
            listNode.val = listNode.next.val;
            listNode.next = listNode.next.next;
        }
        return false;
    }

    // Example Class
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
