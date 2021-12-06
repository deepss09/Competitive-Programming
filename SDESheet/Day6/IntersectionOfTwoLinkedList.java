//better T.C = O(N+M) SC = O(N)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode a = headA;
        while(a!=null){
            set.add(a);
            a = a.next;
        }
        ListNode b =headB;
        while(b!=null){
            if(set.contains(b)){
                return b;
            }
            b = b.next;
        }
        return null;
    }
}

//Optimize TC = O(2M) SC = O(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        //if a & b have different len, then we will stop the loop after second iteration
        while(a!=b){
             //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headA : a.next;
            b = b == null? headB : b.next;
        }
        return a;
    }
}