// You are given a positive integer n.
// Return the maximum product of any two digits in n.
// Note: You may use the same digit twice if it appears more than once in n.

// Example 1:
// Input: n = 31
// Output: 3
// Explanation:
// The digits of n are [3, 1].
// The possible products of any two digits are: 3 * 1 = 3.
// The maximum product is 3.

// Example 2:
// Input: n = 22
// Output: 4
// Explanation:
// The digits of n are [2, 2].
// The possible products of any two digits are: 2 * 2 = 4.
// The maximum product is 4.

// Example 3:
// Input: n = 124
// Output: 8
// Explanation:
// The digits of n are [1, 2, 4].
// The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
// The maximum product is 8.
 
// Constraints:
// 10 <= n <= 109


import java.util.Arrays;
public class Ques3536 {
    // My approach for this code
    public static int maxProduct(int n) {
        int number = n;
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(digits);
        return digits[digits.length-1] * digits[digits.length-2];  
    }

    // Optimized code for this problem

    // public static int maxProduct(int n){
    //     int m1 = 0,m2=0;
    //     while(n>0){
    //         int m = n%10;
    //         if(m>m1){
    //             m2 = m1;
    //             m1 = m;
    //         }
    //         else if(m>m2){
    //             m2 = m;
    //         }
    //         n/=10;
    //     }
    //     return m1*m2;
    // }
    public static void main(String args[]){
        int n = 31;
        System.out.println(maxProduct(n));
    }
}