 //Brute Force
* public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tail = head;
        while(tail !=null){
            list.add(tail.val);
            tail = tail.next;
        }
        int i=0,j=list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//Optimal Approach
class Solution {
    public boolean isPalindrome(ListNode head) {
          if(head == null || head.next == null)
              return true;
          
        ListNode slow = head;
        ListNode fast = head;
        //mid of a linked list;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the right half;
        slow.next = reverse(slow.next);
        
        //move slow to right half;
        slow = slow.next;
        
        //check for left half right half equal or not
        while(slow !=null){
            if(head.val != slow.val)
                return false;
                head = head.next;
                slow = slow.next;
            }
            return true;
        }
    
        public ListNode reverse(ListNode head){
            ListNode pre = null;
            ListNode next = null;
            while(head!=null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
}