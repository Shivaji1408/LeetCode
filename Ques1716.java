public class Ques1716 {
    public static int totalMoney(int n) {
        int repeat = n/7;
        int money = 0;
        for(int i=1; i<=repeat; i++){
            for(int j=i; j<i+7; j++){
                money = money + j;
            }
        }
        int temp = n-(repeat*7);
        for(int j=repeat+1; j<(temp + repeat+1); j++){
            money = money + j;
        } 
        return money;
    }
    public static void main(String args[])[
        int n = 20;
        System.out.println(totalMoney(n));
    ]
}