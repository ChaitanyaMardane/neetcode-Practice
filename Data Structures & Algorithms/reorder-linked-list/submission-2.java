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
    public void reorderList(ListNode head) {
        ListNode s=head, f = head;
        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode l2 = s.next;
        s.next = null;
        l2 = reverse(l2);
        ListNode temp = head;
        while(temp!=null && l2!=null ){
            ListNode temp2= temp.next;
            ListNode l2next = l2.next;
            temp.next = l2;
            l2.next = temp2;
            temp=temp2;
            l2=l2next;
        }
       
        
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev= null;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}
