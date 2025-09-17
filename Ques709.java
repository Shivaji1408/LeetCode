// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

// Example 1:
// Input: s = "Hello"
// Output: "hello"

// Example 2:
// Input: s = "here"
// Output: "here"

// Example 3:
// Input: s = "LOVELY"
// Output: "lovely"
 
// Constraints:
// 1 <= s.length <= 100
// s consists of printable ASCII characters.


public class Ques709 {
    public static String toLowerCase(String s) {
        // ===>> First Easy Solution <<===
        
        // return s.toLowerCase();
        
        // ===>> Second Solution <<===
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                str.append((char)(s.charAt(i) + 32));
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
        
        // ===>> Third Solution <<===
        // String str = "";
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        //         str += (char)(s.charAt(i) + 32);
        //     }else{
        //         str += s.charAt(i);
        //     }
        // }
        // return str;
    }
    public static void main(String args[]){
        String str = "HELLO";
        System.out.println(toLowerCase(str));
    }
}