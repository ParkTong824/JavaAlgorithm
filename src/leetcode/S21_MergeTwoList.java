package leetcode;

import java.util.LinkedList;
import java.util.List;

public class S21_MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> ll = new LinkedList<Integer>();
        ListNode sol = new ListNode(0);
        ListNode head = sol;
        while(l1 != null && l2!=null){
            if (l1.val < l2.val){
                sol.next = new ListNode(l1.val);
                sol = sol.next;
                l1 = l1.next;
            }else{
                sol.next = new ListNode(l2.val);
                sol = sol.next;
                l2 = l2.next;
            }
        }
        while(l1!=null){
            sol.next = new ListNode(l1.val);
            sol = sol.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sol.next = new ListNode(l2.val);
            sol = sol.next;
            l2 = l2.next;
        }
        return head.next;

    }

    public static class ListNode {
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

}
