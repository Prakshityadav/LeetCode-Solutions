/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    // Reverse exactly k nodes starting from head
    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Connect the tail of reversed part to remaining list
        head.next = curr;
        return prev;
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {

           
            ListNode temp = curr;
            int len = 0;

            while (temp != null && len < groupSize) {
                temp = temp.next;
                len++;
            }

            if (len % 2 == 0) {
                ListNode newHead = reverse(curr, len);
                prevGroup.next = newHead;

                prevGroup = curr;
                curr = curr.next;
            } else {
                while (len-- > 0) {
                    prevGroup = curr;
                    curr = curr.next;
                }
            }
            groupSize++;
        }
        return dummy.next;
    }
}