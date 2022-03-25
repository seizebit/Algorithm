/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        ListNode h1 = ans;
        while(ans != null && ans.next != null){
            if(ans.val == ans.next.val){
                ans.next = ans.next.next;
            } else {
                ans = ans.next;
            }
        }
        return h1;
    }
}
// @lc code=end

