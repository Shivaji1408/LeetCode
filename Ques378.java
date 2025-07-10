import java.util.Arrays;
public class Ques378 {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] temp = new int[n*n];
        int a = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                temp[a] = matrix[i][j];
                a++;
            }
        }
        Arrays.sort(temp);
        return temp[k-1];
    }
    public static void main(String args[]){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
}