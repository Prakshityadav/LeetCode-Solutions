// 19 : Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/// Difficulty: Medium

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode ptr=head;
        int length=0;
        while(ptr!=null){
            length++;
            ptr=ptr.next;
        }
        int m=length-n;
        ptr=dummy;
        for(int i=0;i<m;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return dummy.next;
    }
}
// This code removes the nth node from the end of a linked list.