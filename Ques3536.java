import java.util.Arrays;
public class Ques3536 {
    public static int maxProduct(int n) {
        int number = n;
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(digits);
        return digits[digits.length-1] * digits[digits.length-2];  
    }
    public static void main(String args[]){
        int n = 31;
        System.out.println(maxProduct(n));
    }
}