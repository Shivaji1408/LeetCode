// Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.
// A pair (i, j) is fair if:
// 0 <= i < j < n, and
// lower <= nums[i] + nums[j] <= upper

// Example 1:
// Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
// Output: 6
// Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).

// Example 2:
// Input: nums = [1,7,9,2,5], lower = 11, upper = 11
// Output: 1
// Explanation: There is a single fair pair: (2,3).

// Constraints:
// 1 <= nums.length <= 105
// nums.length == n
// -109 <= nums[i] <= 109
// -109 <= lower <= upper <= 109




// public class Ques2563 {
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         // Sort the array to apply binary search
//         Arrays.sort(nums);
//         long count = 0;
//         // For each element, find how many valid pairs it can form with elements after it
//         for (int i = 0; i < nums.length; i++) {
//             // Find the first index j > i such that nums[i] + nums[j] >= lower
//             int left = lowerBound(nums, i + 1, lower - nums[i]);
//             // Find the first index j > i such that nums[i] + nums[j] > upper
//             int right = upperBound(nums, i + 1, upper - nums[i]);
//             // All elements from left to right-1 are valid
//             count += right - left;
//         }
//         return count;
//     }
//     // Custom lowerBound function to find first index with value >= target
//     private int lowerBound(int[] nums, int start, int target) {
//         int low = start, high = nums.length;
//         while (low < high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] < target) low = mid + 1;
//             else high = mid;
//         }
//         return low;
//     }
//     // Custom upperBound function to find first index with value > target
//     private int upperBound(int[] nums, int start, int target) {
//         int low = start, high = nums.length;
//         while (low < high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] <= target) low = mid + 1;
//             else high = mid;
//         }
//         return low;
//     }
// }



import java.util.Arrays;

public class Ques2563 {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    private static long count(int[] nums, int target) {
        long res = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else res += right - left++;
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {0,1,7,4,4,5};
        int lower = 3 , upper = 6;
        System.out.println(countFairPairs(nums, lower, upper));
    }
}