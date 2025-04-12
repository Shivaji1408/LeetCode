public class Solution {
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