public class Ques1317 {
    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isValid(a) && isValid(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }

    private static boolean isValid(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
    public static void main(String args[]){
        int n = 11;
        System.out.print(getNoZeroIntegers(n)[0] + " " + getNoZeroIntegers(n)[1] );
    }
}