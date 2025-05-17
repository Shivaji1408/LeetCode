public class Ques557 {
    public static String reverseWords(String s) {
        int len = s.length();
        int a = 0;
        int b = 0;
        String st1 = "";
        while(a<len){
            while(a < len && s.charAt(a) == ' '){
                st1 += " ";
                a++;
            }
            b = a;
            while(b < len && s.charAt(b) != ' '){
                b++;
            }
            String s2 = s.substring(a,b);
            st1 += reverseword(s2);
            a = b;
        }
        return st1;
    }
    public static String reverseword(String str){
        String s1 = "";
        for(int i=str.length()-1; i>=0; i--){
            s1 += str.charAt(i);
        }
        return s1;
    }

    public static void main(String args[]){
        String str = "Let's take LeetCode contest";
        String st = reverseWords(str);
        System.out.println(st);
    }
}