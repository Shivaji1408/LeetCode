// Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

// Example 1:
// Input: matrix =
// [
//   [0,1,1,1],
//   [1,1,1,1],
//   [0,1,1,1]
// ]
// Output: 15
// Explanation: 
// There are 10 squares of side 1.
// There are 4 squares of side 2.
// There is  1 square of side 3.
// Total number of squares = 10 + 4 + 1 = 15.

// Example 2:
// Input: matrix = 
// [
//   [1,0,1],
//   [1,1,0],
//   [1,1,0]
// ]
// Output: 7
// Explanation: 
// There are 6 squares of side 1.  
// There is 1 square of side 2. 
// Total number of squares = 6 + 1 = 7.
 
// Constraints:
// 1 <= arr.length <= 300
// 1 <= arr[0].length <= 300
// 0 <= arr[i][j] <= 1


public class Ques1277 {
    public static int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 1; i < rows; i++) if (matrix[i][0] == 1) matrix[i][0] = 1; 
        for (int j = 1; j < cols; j++) if (matrix[0][j] == 1) matrix[0][j] = 1;  
 
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1])) + 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) count += matrix[i][j];

        return count;
    }

    public static void main(String args[]){
        int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        System.out.println(countSquares(matrix));
    }
}