public class Ques1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int max = 0;
        int[][] dp = new int[len1+1][len2+1];
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[i].length; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
}
