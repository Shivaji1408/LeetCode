public class Ques3174 {
    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String s = "abc321";
        System.out.println(clearDigits(s));
    }
}