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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode ml = ans;

        ListNode l = list1;
        ListNode r = list2;
        while(l!=null && r!=null ) {
            System.out.print("While loop");
            if(l.val>r.val){
                ml.next=r;
                r=r.next;
            }else{
                 ml.next=l;
                l=l.next;
            }
                ml=ml.next;

        }
        while(l!=null){
            System.out.println(l);

            ml.next = l;
            ml=ml.next;
            l=l.next;
        }
         while(r!=null){
            System.out.println(r);

            ml.next = r;
            ml=ml.next;
            r=r.next;
        }
        return ans.next;
        
    }
}