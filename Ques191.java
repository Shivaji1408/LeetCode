// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

// Example 1:
// Input: n = 11
// Output: 3
// Explanation:
// The input binary string 1011 has a total of three set bits.

// Example 2:
// Input: n = 128
// Output: 1
// Explanation:
// The input binary string 10000000 has a total of one set bit.

// Example 3:
// Input: n = 2147483645
// Output: 30
// Explanation:
// The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

// Constraints:
// 1 <= n <= 231 - 1


import java.util.ArrayList;
public class Ques191{

    //  My Approach for this question

    public static int hammingWeight(int n) {
        ArrayList<Integer> lst = binary(n);
        int count = 0;
        for(int i=0; i<lst.size(); i++){
            if(lst.get(i) == 1){
                count++;
            }
        }
        return count;
    }
    public static ArrayList<Integer> binary(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        while(n > 0){
            int temp = n%2;
            n = n/2;
            lst.add(temp);
        }
        return lst;
    }

    // Optimized Solution for this question

    // public static int hammingWeight(int n) {
    //     int setBits = Integer.bitCount(n);
    //     return setBits;
    // }

    public static void main(String args[]){
        int n = 128;
        System.out.println(hammingWeight(n));
    }
}