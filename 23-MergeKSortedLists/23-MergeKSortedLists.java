// Last updated: 7/17/2026, 3:09:46 PM

class Solution {
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;
        while(head1 !=null && head2!=null){
            if(head1.val <= head2.val){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
        while(head1 != null){
            temp.next=head1;
            temp=temp.next;
            head1=head1.next;
        }
        while(head2 != null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }
        return mergedLL.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next = null;
        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(right);
        return merge(newLeft , newRight);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i=0; i < n; i++) {
            temp.next = lists[i];
            while(temp.next != null){
                temp = temp.next;
            }
        }
        return sortList(head.next);
    }
}