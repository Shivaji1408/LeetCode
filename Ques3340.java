
public class Ques3340 {
    public static boolean isbalanced(String num){
        // int len = num.length();
        // int[] digit = new int[len];
        // for(int i=0; i<len; i++){
        //     digit[i] = num.charAt(i) - '0';
        // }

        // int oddsum = 0;
        // int evensum = 0;
        // for(int i=0; i<digit.length; i++){
        //     if(i%2 == 0){
        //         evensum += digit[i];
        //     }else{
        //         oddsum += digit[i];
        //     }
        // }
        // return (oddsum == evensum);

        int len = num.length();
        int oddsum = 0;
        int evensum = 0;
        for(int i=0; i<len; i++){
            if(i%2 == 0){
                evensum += num.charAt(i) - '0';
            }else{
                oddsum += num.charAt(i) - '0';
            }
        }
        return (oddsum == evensum);
    }
    public static void main(String args[]){
        String num = "24123";
        System.out.println(isbalanced(num));
    }
}