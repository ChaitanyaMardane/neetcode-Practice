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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(-1);
        ListNode ans = temp;
        while(l1!=null && l2!=null){
            int value = l1.val+l2.val + carry;
            carry=0;
            if(value>9){
                int x =value%10;
                carry = value/10;
                value = x;
            }
            System.out.print(carry);
            ans.next = new ListNode(value);
            ans = ans.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
             int value = l1.val+ carry;
            carry=0;
            if(value>9){
                int x =value%10;
                carry = value/10;
                value = x;
            }
            ans.next= new ListNode(value);
            ans = ans.next;
            l1=l1.next;
        }while(l2!=null){
             int value = l2.val+ carry;
            carry=0;
            if(value>9){
                int x =value%10;
                carry = value/10;
                value = x;
            }
            ans.next= new ListNode(value);
            ans = ans.next;
            l2=l2.next;
        }
        if(carry!=0) ans.next = new ListNode(carry);
        return temp.next;
        
    }
}
