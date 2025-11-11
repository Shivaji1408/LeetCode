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