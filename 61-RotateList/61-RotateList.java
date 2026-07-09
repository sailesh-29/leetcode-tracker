// Last updated: 7/9/2026, 10:07:33 AM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int n = 1;
        ListNode current = head;
        while(current.next!=null){
            current=current.next;
            n++;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        current.next=head;
        int steps=n-k-1;
        for(int i=0;i<=steps;i++){
            current=current.next;
        }
        ListNode newHead = current.next;
        current.next=null; 
        return newHead;
    }
}