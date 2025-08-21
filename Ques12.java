public class Ques12{
    // public static String intToRoman(int num){
    //     String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    //     String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    //     String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    //     String ths[]={"","M","MM","MMM"};
    //     return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    // }


    // Optimized Code
    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,  4,  1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        int num = 50;
        System.out.print(intToRoman(num));
    }
}