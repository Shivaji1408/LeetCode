public class Ques3370 {
    public static int smallestNumber(int n) {
        if(n<2){
            return 1;
        }else if(n < 4){
            return 3;
        }else if(n < 8){
            return 7;
        }else if(n < 16){
            return 15;
        }else if(n < 32){
            return 31;
        }else if(n < 64){
            return 63;
        }else if(n < 128){
            return 127;
        }else if(n < 256){
            return 255;
        }else if(n < 512){
            return 511;
        }else if(n < 1024){
            return 1023;
        }
        return n;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(smallestNumber(n));
    }
}