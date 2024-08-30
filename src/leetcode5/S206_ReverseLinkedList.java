package leetcode5;

import java.util.ArrayList;
import java.util.List;

public class S206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<ListNode> nodeList = new ArrayList<>();
        while (head != null) {
            nodeList.add(head);
            if (head.next == null) {
                break;
            }
            head = head.next;
        }
        for (int i = nodeList.size()-1 ; i >= 0 ; i--) {
            if (i > 0) {
                nodeList.get(i).next = nodeList.get(i-1);
            } else {
                nodeList.get(i).next = null;
            }
        }
        return nodeList.getLast();
    }
}
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

 */