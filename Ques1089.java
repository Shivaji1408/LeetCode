public class Ques1089 {
    public static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if(arr[i] == 0){
                index+=2;
            } else {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<result.length; i++){
            arr[i] = result[i];
        }
    }
    public static void main(String args[]){
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}