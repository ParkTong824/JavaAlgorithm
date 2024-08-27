package leetcode5;

public class S203_RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode listNode = ListNode.makeListNode();
        ListNode answer = removeElements(listNode, 6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode checkNode = new ListNode(val+1, head);
        ListNode tempNode = checkNode;
        while (tempNode != null) {
            ListNode nextNode = tempNode.next;
            while (nextNode != null && nextNode.val == val) {
                nextNode = nextNode.next;
            }
            tempNode.next = nextNode;
            tempNode = nextNode;
        }
        return checkNode.next;
    }

    private ListNode getNextElements(ListNode node, int val) {
        if (node == null || node.next == null) {
            return null;
        } else {
            return node.next;
        }
    }
}
/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
and return the new head.


Example 1:

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []


Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
 */
