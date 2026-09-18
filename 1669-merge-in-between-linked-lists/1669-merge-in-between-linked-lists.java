/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first=list1;
        for(int i=0;i<a-1;i++){
            first=first.next;
        }
        ListNode second=first;
        for(int i=a;i<=b;i++){
            second=second.next;
        }
        ListNode curr=list2;
        while(curr.next!=null){
            curr=curr.next;
        }
        first.next=list2;
        curr.next=second.next;
        return list1;
    }
}