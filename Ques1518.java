public class Ques1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drink = 0;
        while(numBottles >= numExchange){
            drink += numExchange;
            numBottles = numBottles - numExchange + 1;
        }
        return drink + numBottles;
    }

    public static void main(String args[]){
        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
}