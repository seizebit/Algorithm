/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1 ;j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[2];
        
    }
}
// @lc code=end
