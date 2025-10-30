public class Ques1526 {
    public static int minNumberOperations(int[] target) {
        int numOpr = target[0];
        for(int i=1;i<target.length;i++){
            if(target[i]>target[i-1]){
                numOpr += target[i]-target[i-1];
            }
        }
        return numOpr;
    }

    public static void main(String args[]){
        int[] target = {1,2,3,2,1};
        System.out.println(minNumberOperations(target));
    }
}