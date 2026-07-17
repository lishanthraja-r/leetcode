// Last updated: 7/17/2026, 3:09:12 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
//skip the n-1 nodes (left - 1)
        for(int i = 0;i < left-1 && current != null;i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse between left and right
        ListNode next = current.next;
        for(int i=0; i < right - left +1;i++){
            current.next = prev;
            prev = current;
            current= next;
            if(next != null){
                next = next.next;
            } 
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;

    return head;

    }
}