// Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
// Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

// Example 1:
// Input: nums = [1,2,2,3,1]
// Output: 2
// Explanation: 
// The input array has a degree of 2 because both elements 1 and 2 appear twice.
// Of the subarrays that have the same degree:
// [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
// The shortest length is 2. So return 2.

// Example 2:
// Input: nums = [1,2,2,3,1,4,2]
// Output: 6
// Explanation: 
// The degree is 3 because the element 2 is repeated 3 times.
// So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.

// Constraints:
// nums.length will be between 1 and 50,000.
// nums[i] will be an integer between 0 and 49,999.


import java.util.HashMap;

class Ques697 {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> freq = new HashMap<>();
        int deg = 0;
        for(int i =0;i<nums.length;i++){
            int val=nums[i];
            if(!freq.containsKey(val)){
                freq.put(val,new int[]{i,i,1});
            }
            else{
                int [] arr = freq.get(val);
                arr[1]=i;
                arr[2]++;
            }
            deg=Math.max(deg,freq.get(val)[2]);
        }
        int len= nums.length;
        for(int key : freq.keySet()){
            int []arr = freq.get(key);
            if(arr[2]==deg){
                len =Math.min(len, arr[1]-arr[0]+1);
            }
        }
        return len;
    }
    public static void main(String args[]){
        int[] nums = {1,2,2,3,1};
        System.out.println(findShortestSubArray(nums));
    }
}