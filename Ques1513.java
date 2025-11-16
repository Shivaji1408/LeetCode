class Ques1513 {
    public static int numSub(String s) {
        int MOD = 1_000_000_007;
        int totalSubstrings = 0;
        int consecutiveOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                consecutiveOnes++;
                totalSubstrings = (totalSubstrings + consecutiveOnes) % MOD;            
            } else {
                consecutiveOnes = 0;
            }
        }
        return totalSubstrings;
    }

    public static void main(String args[]){
        String s = "0110111";
        System.out.println(numSub(s));
    }
}