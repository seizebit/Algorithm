/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integere> Intersection = new HashSet();
        Set<Integere> ans = new HashSet();
        for (int i = 0; i < nums1.length(); i++){
            Intersection.add(nums1[1]);
        }
        for (int i = 0; i < nums2.length(); i++){
            if (Intersection.contains(nums2[i])){
                ans.add(num2[i]);
            }
            return ans;

        }

    }
}
// @lc code=end

