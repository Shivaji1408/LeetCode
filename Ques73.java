// public class Ques73 {
//     public void setZeroes(int[][] matrix) {
//         boolean fr = false,fc = false;
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 if(matrix[i][j] == 0) {
//                     if(i == 0) fr = true;
//                     if(j == 0) fc = true;
//                     matrix[0][j] = 0;
//                     matrix[i][0] = 0;
//                 }
//             }
//         }
//         for(int i = 1; i < matrix.length; i++) {
//             for(int j = 1; j < matrix[0].length; j++) {
//                 if(matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//             }}
//         }
//         if(fr) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 matrix[0][j] = 0;
//             }
//         }
//         if(fc) {
//             for(int i = 0; i < matrix.length; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }  




class Ques73 {
    public void setZeroes(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0){
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols= new boolean[n];

        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0 ){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            if(zeroRows[i]){
                for(int  j=0; j<n;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j=0; j<n; j++){
            if(zeroCols[j]){
                for(int i =0; i<m; i++){
                    matrix[i][j] =0;
                }
            }
        }
    }
}