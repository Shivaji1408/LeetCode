import java.util.Scanner;
public class Solution {
    public static int[] findFactors(int number){
        int count = 0;
        int[] arr = new int[number];
        for(int i=1; i<number; i++){
            if(number % i == 0){
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        for(int i=1; i<=findFactors(number).length; i++){
            System.out.println(findFactors(number)[i]);
        }
    }
}