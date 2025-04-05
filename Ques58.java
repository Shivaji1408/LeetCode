public class Ques58 {
    public static int lengthOfLastWord(String s) {
        String st = s.trim();
        int len = 0;
        for(int i=st.length()-1; i>=0; i--){
            if(st.charAt(i) == ' '){
                break;
            }else{
                len++;
            }
        }
        return len;
    }

    public static void main(String args[]){
        String s = "Hello World    ";
        System.out.println(lengthOfLastWord(s));
    }
}