public class Ques168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
    public static void main(String args[]){
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
}
