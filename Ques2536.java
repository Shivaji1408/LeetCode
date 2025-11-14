public class Ques2536 {
    public static void changeMatrix(int row1, int col1, int row2, int col2, int[][] mat){
        for(int i=row1; i<=row2; i++){
            for(int j=col1; j<=col2; j++){
                mat[i][j]++;
            }
        }
    }
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for(int i=0; i<queries.length; i++){
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];
            changeMatrix(row1,col1,row2,col2,mat);
        }
        return mat;
    }

    public static void main(String args[]){
        int n = 3;
        int[][] queries = {{1,1,2,2},{0,0,1,1}};
        int[][] res = rangeAddQueries(n, queries);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}