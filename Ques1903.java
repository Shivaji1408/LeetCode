public class Ques1903 {
    public static String largestOddNumber(String num) {
        String res = "";
        for(int i=num.length()-1; i>=0; i--){
            int a = num.charAt(i)- 0;
            if(a % 2 == 0){
                continue;
            }else{
                res = num.substring(0,i+1);
                return res;
            }
        }
        return res;
    }

    public static void main(String args[]){
        String str = "42687";
        System.out.println(largestOddNumber(str));
    }
}