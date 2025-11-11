// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]

// Example 2:
// Input: matrix = [[1,2,3],[4,5,6]]
// Output: [[1,4],[2,5],[3,6]]
 
// Constraints:
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 1000
// 1 <= m * n <= 105
// -109 <= matrix[i][j] <= 109


public class Ques867 {
    public static int[][] transpose(int[][] matrix) {
        int a = matrix[0].length;
        int b = matrix.length;
        int[][] res = new int[a][b];
        for(int row=0; row<b; row++){
            for(int col=0; col<a; col++){
                res[col][row] = matrix[row][col];
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] temp = transpose(matrix);
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}