// Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
// You may assume the input array always has a valid answer.

// Example 1:
// Input: nums = [1,5,1,1,6,4]
// Output: [1,6,1,5,1,4]
// Explanation: [1,4,1,5,1,6] is also accepted.

// Example 2:
// Input: nums = [1,3,2,2,3,1]
// Output: [2,3,1,3,1,2]
 
// Constraints:
// 1 <= nums.length <= 5 * 104
// 0 <= nums[i] <= 5000
// It is guaranteed that there will be an answer for the given input nums.


import java.util.Arrays;

public class Ques324 {
    public static void wiggleSort(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int len = nums.length;
        int mid = (len+1)/2;
        int left = mid - 1;
        int right = len - 1;
        for(int i=0; i<len; i++){
            if(i%2==0){
                nums[i] = temp[left--];
            }else{
                nums[i] = temp[right--];
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {1,5,1,1,6,4};
        wiggleSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
