// Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
// palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

// Example 1:
// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

// Example 2:
// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.

// Constraints:
// 1 <= s.length <= 2000
// s consists of lowercase and/or uppercase English letters only.


public class Ques409{
    public static int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(int i=0; i< s.length(); i++){
            freq[s.charAt(i)]++;
        }
        int ans = 0;
        boolean hasodd = false;
        for(int i=0; i<freq.length;i++){
            if(freq[i]%2 == 0){
                ans += freq[i];
            }else{
                ans += freq[i]-1;
                hasodd = true;
            }
        }
        if (hasodd){
            ans += 1;
        }
        return ans;
    }
    public static void main(String args[]){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}