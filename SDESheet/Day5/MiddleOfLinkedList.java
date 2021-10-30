1st Solution Time Complexity = O(N)+O(N/2)
class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<n/2;i++){
            temp = temp.next;
        }
        return temp;
    }
}

2nd Solution Time Complexity = O(N/2)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}