public class Ques389 {
    public static char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        for (char c : s.toCharArray()) {
            sumS += c;
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }
        return (char)(sumT - sumS);
    }
    public static void main(String args[]){
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}