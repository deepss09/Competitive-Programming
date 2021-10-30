//1st approach

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Time Complexity= O(N)+O(M)
      if(l1==null){
          return l2;
      }
        if(l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode duplicate = dummy;
        while(l1!=null && l2!=null){
            if(l1.val <l2.val){
                duplicate.next = l1;
                l1 = l1.next;
            }
            else{
                duplicate.next = l2;
                    l2 = l2.next;
            }
            duplicate = duplicate.next;
        }
        //in l1 still there is elements
        if(l1!=null){
             duplicate.next = l1;
            
        }
        if(l2!=null){
             duplicate.next = l2;
        }
        return dummy.next;
    }
}

//2nd approach
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //Space Complexity = O(1)
              if(l1==null){
          return l2;
      }
        if(l2==null){
            return l1;
        }
        if(l1.val > l2.val){
        ListNode temp = l1;
        l1 = l2;
        l2 = temp;
        } 
        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode tmp = null;
            while(l1!=null && l1.val <= l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;
            ListNode temp = l1;
        l1 = l2;
        l2 = temp;
        }
        return res;
    }
}