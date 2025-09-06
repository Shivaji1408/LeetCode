public class Ques66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	        if (digits[i] < 9) {
		    digits[i]++;
		    return digits;
	    }
	    digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        // int[] digits = {1, 2, 3};
        int[] digits = {9};
        int[] result = plusOne(digits);
        for (int i : result) {
            System.out.print(i +  " ");
        }
    }
}