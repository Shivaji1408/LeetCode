public class Ques344 {
    public static void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n/2; i++){
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
    }

    public static void printarr(char[] s){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
    public static void main(String args[]){
        char[] s = {'H','E','L','L','O'};
        reverseString(s);
        printarr(s);
    }
}