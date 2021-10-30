//1st approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head.next == null) return null;
        int si = size(head);
        int index = si - n;
        ListNode temp = head;
        if(index == 0){
            head = head.next;
        }else{
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
        return head;
    }
    public int size(ListNode head){
       int count = 0;
        while(head !=null){
            head = head.next;
            count++;
        }
    return count;
}
}

//2nd approach optimized
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
    
}
