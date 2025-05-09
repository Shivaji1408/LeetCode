// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.


public class Ques349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //initialize a new array of 1001 size
        int[] temp = new int[1001];  

        // mark the numbers as 1 that present in nums1
        for (int i : nums1) {
            temp[i] = 1;
        }

        // here count the numbers that present in both arrays and increase the number of these numbers as 2
        int count = 0;
        for (int i : nums2) {
            if (temp[i] == 1) {
                count++;
                temp[i] = 2;
            }
        }

        // here create a new array of count size/ number that present in both element 
        // and add those number in this new array and decrease their number from 2 to 1 so it does not count twice.
        int arr[] = new int[count];
        int j = 0;
        for (int i : nums2) {
            if (temp[i] == 2) {
                temp[i] = 1;
                arr[j] = i;
                j++;
            }
        }

        // return the array
        return arr;
    }

    public static void main(String args[]){
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] res = intersection(num1, num2);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }    
}
