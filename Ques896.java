// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. 
// An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:
// Input: nums = [1,2,2,3]
// Output: true

// Example 2:
// Input: nums = [6,5,4,4]
// Output: true

// Example 3:
// Input: nums = [1,3,2]
// Output: false
 
// Constraints:
// 1 <= nums.length <= 105
// -105 <= nums[i] <= 105


public class Ques896 {
    public static boolean isMonotonic(int[] nums) {
        if(nums[0] < nums[nums.length-1]){
            return ascending(nums);
        }
        if(nums[0] > nums[nums.length-1]){
            return decending(nums);
        }
        if(nums[0] == nums[nums.length-1]){
            return equal(nums);
        }
        return false;
        
    }
    public static boolean ascending(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean decending(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean equal(int[] nums){
        boolean res = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                res = false;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}