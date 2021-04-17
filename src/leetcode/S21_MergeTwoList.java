package leetcode;

public class S21_MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode();
        boolean isFinish = false;
        while (!isFinish) {
            isFinish = mergeTwoList(l1, l2, resultList);
        }
        return resultList;
    }

    public boolean mergeTwoList(ListNode firstNode, ListNode secondNode, ListNode mergeNode) {
        if (firstNode.next != null && secondNode.next != null) {
            if (firstNode.val == secondNode.val) {
                mergeNode.val = firstNode.val;
                mergeNode.val = secondNode.val;
                firstNode.val = firstNode.next.val;
                firstNode.next = firstNode.next.next;
                secondNode.val = secondNode.next.val;
                secondNode.next = secondNode.next.next;
            } else if (firstNode.val > secondNode.val) {
                mergeNode.val = secondNode.val;
                mergeNode.next = new ListNode();
                mergeNode.val = mergeNode.next.val;
                secondNode.val = secondNode.next.val;
                secondNode.next = secondNode.next.next;
            } else {
                mergeNode.val = secondNode.val;
                mergeNode.next = new ListNode();
                mergeNode.val = mergeNode.next.val;
                secondNode.val = secondNode.next.val;
                secondNode.next = secondNode.next.next;
            }
        } else if (firstNode.next != null) {

        } else if (secondNode.next != null) {

        }
        return false;
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
