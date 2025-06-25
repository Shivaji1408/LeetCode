// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:
// Input: nums = [1,2,3]
// Output: 6

// Example 2:
// Input: nums = [1,2,3,4]
// Output: 24

// Example 3:
// Input: nums = [-1,-2,-3]
// Output: -6


// Constraints:
// 3 <= nums.length <= 104
// -1000 <= nums[i] <= 1000

import java.util.*;
public class Ques628{
    public static int maximumProduct(int[] nums) {
       int len = nums.length;
       Arrays.sort(nums);      
       int prod1 = Math.max(nums[0]*nums[1]*nums[2],nums[0]*nums[1]*nums[len-1]);
       int prod2 = nums[len-1] * nums[len-2] * nums[len-3];
       return Math.max(prod1,prod2);
    }

    public static void main(String args[]){
        int[] nums = {-1,-2,-3,4};
        System.out.println(maximumProduct(nums));
    }
}