// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
// Example 1:
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]

// Example 2:
// Input: n = 1
// Output: ["()"]

// Constraints:
// 1 <= n <= 8

import java.util.ArrayList;  
import java.util.List;  

public class Ques22 {  
    public static List<String> generateParenthesis(int n) {  
        List<String> ll = new ArrayList<>();  
        pare(n, 0, 0, "", ll);  
        return ll;   
    }  
    
    public static void pare(int n, int op, int cl, String ans, List<String> ll) {  
        if (op == n && cl == n) {  
            ll.add(ans);  
            return;  
        }  
        if (op < n) {  
            pare(n, op + 1, cl, ans + "(", ll);  
        }  
        if (cl < op) {  
            pare(n, op, cl + 1, ans + ")", ll);  
        }  
    }  

    public static void main(String args[]){
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}