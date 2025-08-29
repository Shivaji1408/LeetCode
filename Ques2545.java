public class Ques2545 {
    public static int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    int temp[] = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        return score;
    }
    public static void main(String args[]){
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        int[][] sortedScore = sortTheStudents(score, k);
        for (int i = 0; i < sortedScore.length; i++) {
            for (int j = 0; j < sortedScore[i].length; j++) {
                System.out.print(sortedScore[i][j] + " ");
            }
            System.out.println();
        }
    }
}