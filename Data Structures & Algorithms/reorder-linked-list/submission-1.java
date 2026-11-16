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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr=  head;
        while(curr!= null ){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow= head, prev=head,fast =head;
        int cnt=0;
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt<=1) return;
        while(fast!=null && fast.next!=null ){
            prev=slow;
            slow =slow.next;
            fast= fast.next.next;


        }
        // System.out.println(prev.val);
        ListNode head2= prev.next;
        prev.next=null;
        ListNode rev = reverseList(head2);
        // System.out.println(rev.val);
        ListNode org = head;
        // System.out.println(org.val);

        // System.out.println(rev.val);
ListNode next1 = org.next;
        ListNode next2= rev.next;
        while(org!=null && rev!=null){
         next1 = org.next;
         next2= rev.next;
         org.next=rev;
         if(next1==null &&  rev!=null && rev.next!=null){
            rev=rev.next;
         }
         rev.next=next1;
         org=rev.next;
         rev=next2;

        }
       
      
    }
}
