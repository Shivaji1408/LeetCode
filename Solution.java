import java.util.Random;
import java.util.Scanner;
public class Solution {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char[] ch = {'s','p','r'};
        int i = 0;
        while (i < 2) { 
            System.out.print("Enter your Choice : ");
            String choice = sc.nextLine();
            int idx = random.nextInt(3 - 0 + 1) + 0;
            System.out.println(idx);
            i++;
        }
    }
}
