// Last updated: 7/25/2026, 9:22:47 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 * int val;
5 * ListNode next;
6 * ListNode() {}
7 * ListNode(int val) { this.val = val; }
8 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    // Helper function to reverse a linked list in-place 🔄
13    public ListNode reverse(ListNode head){
14        ListNode prev = null;
15        ListNode curr = head;
16        while(curr != null){
17            ListNode next = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr = next;
21        }
22        return prev;
23    }
24    
25    public boolean isPalindrome(ListNode head) {
26        // Step 1: Find the middle of the linked list using slow & fast pointers 🐢🐇
27        ListNode slow = head;
28        ListNode fast = head.next;
29        while(fast != null && fast.next != null){
30            slow = slow.next;
31            fast = fast.next.next;
32        }
33        
34        // Step 2: Reverse the second half of the linked list 🔃
35        ListNode rev = reverse(slow.next);
36        
37        // Step 3: Disconnect the first half from the second half ✂️
38        slow.next = null;
39        
40        // Step 4: Compare both halves element by element 🤝
41        while(rev != null){
42            if(head.val != rev.val){
43                return false; // Mismatch found! Not a palindrome.
44            }
45            rev = rev.next;
46            head = head.next;
47        }
48        
49        return true; // All elements matched perfectly!
50    }
51}