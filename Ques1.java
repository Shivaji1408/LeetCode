// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:
// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109



public class Ques1 {
    public static void printarray(int[] nums ){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        // <<<=== My Solution ===>>>
        
        // int arr[]=new int[2];
        // for(int i=0; i<nums.length; i++){
        //     arr[0]=i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(target==nums[j]+nums[i]){
        //             arr[1]=j;
        //             return arr;
        //         }
        //     } 
        // }
        // return arr;


        // <<<=== Optimised Solution ===>>>
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]+nums[i+1]==target){
              return new int[]{i,i+1};
          }  
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
                }
            }
        }
        return new int[]{1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {3,3}; 
        int target = 6;
        printarray(twoSum(nums, target));
    }    
}
