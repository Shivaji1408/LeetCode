// You are given two positive integers low and high.
// An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x.
// Numbers with an odd number of digits are never symmetric.
// Return the number of symmetric integers in the range [low, high].

// Example 1:
// Input: low = 1, high = 100
// Output: 9
// Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.

// Example 2:
// Input: low = 1200, high = 1230
// Output: 4
// Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 
// Constraints:
// 1 <= low <= high <= 10^4


public class Ques2843 {
    public static int countSymmetricIntegers(int low, int high) {
        int h = high - low;
        int[] arr = new int[h+1];
        int j=0;
        for(int i=low; i<=high; i++){
            arr[j] = i;
            j++;
        }

        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            String st = Integer.toString(arr[i]);
            int len = st.length();

            if(len % 2 == 0){
                int sum1 = 0;
                int sum2 = 0;
                int n = len / 2;

                for(int a=0; a<n; a++){
                    int num1 = Character.getNumericValue(st.charAt(a));
                    sum1 += num1;
                }
                for(int a=n; a<len; a++){
                    int num2 = Character.getNumericValue(st.charAt(a));
                    sum2 += num2;
                }

                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int low = 1;
        int high = 100;
        System.out.println(countSymmetricIntegers(low,high));
    }
}
