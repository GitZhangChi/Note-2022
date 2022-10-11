package com.example.algorithm;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * <p>
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * <p>
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 为无重复元素的升序排列数组
 * -104 <= target <= 104
 */
public class LeetCode35 {


    class Solution {

        public int searchInsert(int[] nums, int target) {
            int length = nums.length;
            int left = 0;
            int right = length - 1;
            int ans = length;

            while (left <= right) {

                int mid = ((right - left) >> 1) + left;

                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }

            return ans;
        }
    }


}
