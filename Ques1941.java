// Given a string s, return true if s is a good string, or false otherwise.
// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

// Example 1:
// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

// Example 2:
// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 
// Constraints:
// 1 <= s.length <= 1000
// s consists of lowercase English letters.

public class Ques1941 {
    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        int prev = freq[s.charAt(0) - 'a'];
        for(int num: freq){
            if(num != 0 && num != prev){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str = "abacbc";
        System.out.println(areOccurrencesEqual(str));
    }
}