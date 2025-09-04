public class Ques3516 {
    public static int findClosest(int x, int y, int z) {
        int first = Math.abs(z-x);
        int second = Math.abs(z-y);
        if(first < second){
            return 1;
        }else if(first == second){
            return 0;
        }
        return 2;
    }
    public static void main(String args[]){
        int x = 1, y = 2, z = 3;
        System.out.println(findClosest(x, y, z));
    }
}
