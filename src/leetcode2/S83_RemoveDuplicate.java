package leetcode2;

public class S83_RemoveDuplicate {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode checkNode = head;
        while (checkNode != null && checkNode.next != null){
            if (checkNode.next.val==checkNode.val){
                checkNode.next=checkNode.next.next;
            } else {
                checkNode = checkNode.next;
            }
        }

        return head;
    }

}