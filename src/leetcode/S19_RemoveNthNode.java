package leetcode;

public class S19_RemoveNthNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        removeNthFromEnd(head,n);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode mockNode = new ListNode();
        ListNode answerNode = new ListNode();
        while (isNullNode(head)) {
            count++;
        }
        for (int i = 0 ; i < count ; i++){
            if (i==count-n){
                isNullNode(mockNode);
                continue;
            }
            insertNode(answerNode,mockNode.val);
            isNullNode(mockNode);
        }
        return answerNode;
    }

    public static boolean isNullNode(ListNode listNode){
        if (listNode.next==null){
            return false;
        } else {
            listNode.val = listNode.next.val;
            listNode.next = listNode.next.next;

            return true;
        }
    }

    public static void insertNode(ListNode listNode, int val){
        listNode.next= new ListNode();
        listNode.val = val;
        listNode.val = listNode.next.val;
        listNode.next = listNode.next.next;
    }

    /**
     * Definition for singly-linked list.
     */
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
