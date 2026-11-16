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
        ListNode temp = l1,prev =temp;
        ListNode t2=l2;
        int s1=0 , s2=0;
        int carry=0;
        while (temp!=null){
            s1++;
            temp = temp.next;
        }
        temp = l2;
         while (temp!=null){
            s2++;
            temp = temp.next;
        }
        if(s1>=s2){
            temp=l1;
        }else{
        temp=l2;
            t2=l1;

        }
        while (temp!=null && t2!=null){
           int sum=  temp.val+t2.val+carry;
            carry=sum/10;
            sum=sum%10;
            temp.val=sum;
            t2=t2.next;
            prev =temp;

            temp = temp.next;
        }
        if(carry>0){
           while(temp!=null){
            int sum = temp.val +carry;
            carry=sum/10;
            sum=sum%10;
            temp.val=sum;
            prev =temp;
            temp=temp.next;
            if(carry==0) break;
           }
           if(carry>0)prev.next=new ListNode(carry);
         

        }
        return s1>=s2 ? l1:l2;
        
    }
}
