public class Ques566 {
    public static int[] oneDArray(int[][] mat){
        int size = mat.length * mat[0].length;
        int[] temp = new int[size];
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                temp[count] = mat[i][j];
                count++;
            }
        }
        return temp;
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c) != (mat.length*mat[0].length)){
            return mat;
        }
        int[] temp = oneDArray(mat);
        int count = 0;
        int[][] res = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                res[i][j] = temp[count];
                count++;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}