// Last updated: 7/9/2026, 10:07:47 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int digit = sum%10;
            carry=sum/10;
            ListNode newNode = new ListNode(digit);
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;
    }
}