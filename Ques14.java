
import java.util.Arrays;

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

public class Ques14 {
    public static String longestcommonprefix(String[] s){
        StringBuilder result = new StringBuilder();
        Arrays.sort(s);

        char[] first = s[0].toCharArray();
        char[] last = s[s.length-1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if(first[i] != last[i]){
                break;
            }else{
                result.append(first[i]);
            }   
        }
        return result.toString();

        // Optimized Code for this problem
        // if (strs.length == 0) {
        //     return "";
        // }
        // String prefix = strs[0];

        // for (int i = 1; i < strs.length; i++) {
        //     while (strs[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //     }
        // }
        // return prefix;
    }
    public static void main(String args[]){
        String[] str = {"flower","flow","flight"};
        System.out.println(longestcommonprefix(str));
    }
}
