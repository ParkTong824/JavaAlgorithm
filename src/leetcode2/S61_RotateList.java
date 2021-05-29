package leetcode2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null){
            return head;
        }
        if (k==0 || head.next==null){
            return head;
        }
        List<ListNode> nodeList = new ArrayList<>();
        ListNode headNode = new ListNode(head.val,head.next);
        while (headNode.next!=null){
            nodeList.add(headNode);
            headNode=headNode.next;
        }
        nodeList.add(headNode);
        k = k%nodeList.size();
        if (k==0){
            return head;
        }
        int index = nodeList.size()-1;
        int beforeIndex;
        int afterIndex;
        for (int i = 0 ; i < k ; i ++) {
            index = (index<0?nodeList.size()-1:index);
            beforeIndex = index-1;
            afterIndex = index+1;
            beforeIndex = (beforeIndex<0?nodeList.size()-1 : beforeIndex);
            afterIndex = (afterIndex==nodeList.size()?0:afterIndex);
            nodeList.get(index).next=nodeList.get(afterIndex);
            nodeList.get(beforeIndex).next=null;
            index--;
        }
        return nodeList.get(index+1);
    }

    public static void main(String[] args) {
        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2,third);
        ListNode first = new ListNode(1,second);
        third.next.val=1;
        for (int i = 0 ; i < 10 ; i ++){

            System.out.println(third.next.val);
            third = third.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/*
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Input: head = [0,1,2], k = 4
Output: [2,0,1]
 */