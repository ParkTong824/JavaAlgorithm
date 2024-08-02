package leetcode;


public class S21_MergeTwoList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedListNode = new ListNode(0);
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            mergedListNode.val = list2.val;
            list2 = list2.next;
        } else if (list2 == null) {
            mergedListNode.val = list1.val;
            list1 = list1.next;
        } else if (list1.val > list2.val) {
            mergedListNode.val = list2.val;
            list2 = list2.next;
        } else {
            mergedListNode.val = list1.val;
            list1 = list1.next;
        }
        ListNode head = mergedListNode;
        while (true) {
            if (list1 == null && list2 == null) {
                return mergedListNode;
            }
            ListNode tempNode = new ListNode(0);
            if (list1 == null) {
                tempNode.val = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                tempNode.val = list1.val;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                tempNode.val = list2.val;
                list2 = list2.next;
            } else {
                tempNode.val = list1.val;
                list1 = list1.next;
            }
            head.next = tempNode;
            head = tempNode;
        }
    }
    private void makeListNode(ListNode makeNode, ListNode list1, ListNode list2) {

    }

    public class ListNode {
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
