package leetcode5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class S234_palindromeLinkedList {
    public static void main(String[] args) {
        ListNode listNode = ListNode.makeListNode();
        System.out.println(isPalindrome(listNode));
    }
    public static boolean isPalindrome(ListNode head) {
        Queue<Integer> nodeQueue = new LinkedList<>();
        Stack<Integer> nodeStack = new Stack<>();
        while (true) {
            nodeQueue.add(head.val);
            nodeStack.add(head.val);

            if (head.next != null) {
                head = head.next;
            } else {
                break;
            }
        }
        int listSize = nodeQueue.size();
        for (int i = 0 ; i < listSize/2 ; i++) {
            if (nodeQueue.poll() != nodeStack.pop()) {
                return false;
            }
        }
        return true;
    }
}
/*
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */