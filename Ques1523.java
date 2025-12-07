public class Ques1523 {
    public static int countOdds(int low, int high) {
        if((low % 2 == 0) && (high % 2 == 0)){
            return (high-low)/2;
        }
        if((low % 2 != 0) || (high % 2 == 0)){
            return ((high-low)/2) + 1;
        }
        if((low % 2 == 0) || (high % 2 != 0)){
            return ((high-low)/2) + 1;
        }
        return (high-low)/2;
    }

    public static void main(String args[]){
        int low = 1;
        int high = 10000;
        System.out.println(countOdds(low, high));
    }
}