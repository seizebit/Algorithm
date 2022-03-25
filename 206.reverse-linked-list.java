/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current_node = head;
        ListNode next = null;
        while (current_node != null){
            next = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = next;
        }
        head = prev;
        return head;
    }
}
// @lc code=end

