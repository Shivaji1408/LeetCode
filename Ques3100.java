public class Ques3100 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink = numBottles;
        int full = numBottles;
        int empty = numBottles;
        while(empty > numExchange){
            full = 0;
            while(empty > numExchange){
                full++;
                empty = empty - numExchange;
                numExchange++;
            }
            drink += full;
            empty += full;
        }
        if(empty == numExchange){
            drink++;
        }
        return drink;
    }
    public static void main(String args[]){
        int numBottles = 10;
        int numExchange = 3;
        System.out.println(maxBottlesDrunk(numBottles,numExchange));
    }
}