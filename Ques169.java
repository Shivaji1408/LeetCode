// 169. Majority Element

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109


public class Ques169 {
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return nums[n/2];

        int val = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(val != nums[i]){
                if(count > 0){
                    count--; 
                }else{
                    val = nums[i];
                    count = 1;
                }
            }else{
                count++;
            }
        }
        return val;
    }

    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}


