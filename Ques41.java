// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// Example 2:
// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.

// Example 3:
// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.

public class Ques41{
    public static int firstmissing(int[] nums){
        // Arrays.sort(nums);
        // int finalnum = 1;
        // for(int i = 0; i< nums.length;i++){
        //     if(nums[i] < 1){
        //         continue;
        //     }
        //     if(nums[i]==finalnum-1){
        //         continue;
        //     }
        //     if(nums[i]!=finalnum){
        //         return finalnum;
        //     }
        //     finalnum++;
        // }
        // return Math.max(nums[nums.length-1] + 1, 1);

        int c=0;
        int n=nums.length;
        int ans[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0&&nums[i]<=n)
            ans[nums[i]]=1;
        }
        for(int i=1;i<=n;i++)
        {
            if(ans[i]==0)
            return i;
        }
        if(n==1&&(nums[0]==1||nums[0]==0))
        return nums[0]+1;
        return n+1;
    }
    public static void main(String[] args){
        int[] nums = {7,8,9,11,12};
        System.out.println(firstmissing(nums));
    }
}