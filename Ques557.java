// Question = 557 Reverse Words in a String III
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Example 2:
// Input: s = "Mr Ding"
// Output: "rM gniD"

// Constraints:
// 1 <= s.length <= 5 * 104
// s contains printable ASCII characters.
// s does not contain any leading or trailing spaces.
// There is at least one word in s.
// All the words in s are separated by a single space.


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