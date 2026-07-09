// Last updated: 7/9/2026, 10:06:25 AM
class Solution {
    public int pairSum(ListNode head) {
        int max=0;
        //Find middle
        ListNode curr1 = head;
        ListNode curr2 = head;
        while(curr2!=null && curr2.next!=null){
            curr1=curr1.next;
            curr2=curr2.next.next;
        }
        //Reverse the list after middle
        ListNode prev=null;
        while(curr1!=null){
            ListNode next = curr1.next;
            curr1.next = prev;
            prev = curr1;
            curr1 = next;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second!=null){
            max=Math.max(max,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return max;

    }
}