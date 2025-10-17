// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

// Example 1:
// Input: text = "nlaebolko"
// Output: 1

// Example 2:
// Input: text = "loonbalxballpoon"
// Output: 2

// Example 3:
// Input: text = "leetcode"
// Output: 0
 
// Constraints:
// 1 <= text.length <= 104
// text consists of lower case English letters only.


public class Ques1189 {
    public static int maxNumberOfBalloons(String text) {
        int[] f = new int[26];
        for(char ch : text.toCharArray()){ 
            f[ch - 'a']++;
        }
        if (f['l' - 'a'] <= 1 || f['o' - 'a'] <= 1) return 0;
        if (f['b' - 'a'] < 1 || f['a' - 'a'] < 1 || f['b' - 'a'] < 1) return 0;
        int minFreqOfLO = Math.min(f['l' - 'a'] , f['o' - 'a']);
        int minFreqOfBAN = Math.min(f['b' - 'a'] , Math.min(f['a' - 'a'] , f['n' - 'a']));
        return Math.min(minFreqOfLO / 2 , minFreqOfBAN);
    }

    public static void main(String args[]){
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }
}