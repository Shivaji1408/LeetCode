public class Ques3227 {
    public static boolean doesAliceWin(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "ipynb";
        System.out.println(doesAliceWin(str));
    }
}