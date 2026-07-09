// Last updated: 7/9/2026, 10:07:41 AM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while(p1!=null & p2!=null){
            if(p1.val>=p2.val){
                current.next=p2;
                p2=p2.next;
            }else if(p2.val>=p1.val){
                current.next=p1;
                p1=p1.next;
            }
            current=current.next;
        }
        if(p1!=null){
            current.next=p1;
        }else{
            current.next=p2;
        }
        return dummy.next;
    }
}