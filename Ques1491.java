import java.util.Arrays;

public class Ques1491 {
    public static double average(int[] salary) {
        double avg = 0;
        Arrays.sort(salary);
        int i = 1;
        int count = 0;
        while(i<salary.length-1){
            avg += salary[i];
            count++;
            i++;
        }
        return avg/count;
    }
    public static void main(String args[]){
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
}
