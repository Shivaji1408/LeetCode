// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

public class Ques9 {
    public static boolean isPalindrome(int x) {
        int num = 0;
        int n = x;
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        while(x > 0){
            int temp = x%10;
            num = num*10 + temp;
            x = x/10;
        }
        return (num == n);
    }
    public static void main(String args[]){
        int x = 101;
        System.out.println(isPalindrome(x));
    }
}
