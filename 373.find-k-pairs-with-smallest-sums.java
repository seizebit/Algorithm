/*
 * @lc app=leetcode id=373 lang=java
 *
 * [373] Find K Pairs with Smallest Sums
 */

// @lc code=start
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n: nums1)
        Queue<Integer> heap = new PriorityQueue<>(
            (nums1, nums2) -> count.get(nums1) - count.get(nums2));

        

    }
}
// @lc code=end

