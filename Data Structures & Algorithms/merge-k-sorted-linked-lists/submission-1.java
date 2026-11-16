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
    public ListNode mergeKLists(ListNode[] lists) {
        
        int n=lists.length;
        if(n==1)return lists[0];
        if(n==0){return null; }
        // ListNode list1=lists[n-1];
        // ListNode list2=lists[n-2];
        // ListNode mergell;
        // for(int i = n-3;i>=0;i--){
        //     mergell=mergeTwoLists(list1,list2);
        //     list1=mergell;
        //     list2=lists[i];
        // }
        // return mergell=mergeTwoLists(list1,list2);
      
         ArrayList<ListNode> List = new ArrayList<>();
         for( ListNode i : lists){
            List.add(i);
         }
         
        ListNode mergell=new ListNode(100);
       while(List.size()!=1){
            ListNode list1=List.get(0);
            List.remove(List.get(0));
            ListNode list2=List.get(0);
            List.remove(List.get(0));
            // if(List.size()==0)System.out.println("Empty");
            mergell=mergeTwoLists(list1,list2);

            List.add(mergell);
            
        }
        return mergell;
        // return mergell=mergeTwoLists(list1,list2);
    
}
    public  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergell=new ListNode(-1);
        ListNode temp=mergell;
        while (list1!=null && list2!=null){
            if( list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;

            }

       
        }
         if(list1!=null){
            temp.next=list1;
           

            
        }
         if(list2!=null){
            temp.next=list2;
    

            
        }
        // temp.next=null;
        return mergell.next;
        
    }
}
