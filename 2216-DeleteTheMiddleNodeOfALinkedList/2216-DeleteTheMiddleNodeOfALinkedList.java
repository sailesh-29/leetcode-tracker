// Last updated: 7/9/2026, 10:06:27 AM
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int count =0;
        if(head == null){
            return null;
        }else if(head.next==null){
            return null;
        }
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr = head;
        int mid=count/2;
        for(int i=0;i<(count/2)-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;

        
    }
}