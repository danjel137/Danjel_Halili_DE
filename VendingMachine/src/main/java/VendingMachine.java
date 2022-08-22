import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        change(input.nextDouble(), input.nextDouble());
        convert();
        getFirstPartChangeAndSecondChange((int) firstPartChange, (int) secondPartChange);
        returnVector();

    }

    public static int[] allChangeInCoins = new int[]{1, 5, 10, 25, 50, 100};
    public static int[] returnChangeInCoins = new int[]{0, 0, 0, 0, 0, 0};
    static double theChange;


    static double firstPartChange;

    static double secondPartChange;


    public static double change(double m, double p) {
        return  (theChange = m - p);

    }

    public static int[] getFirstPartChangeAndSecondChange(int firstPartChange,int secondPartChange){
        int num1 = 0;
        do {
            for (int i = 0; i < allChangeInCoins.length; i++) {
                if (secondPartChange >= allChangeInCoins[i]) {
                    num1++;
                }
            }
            returnChangeInCoins[num1 - 1]++;
            secondPartChange = secondPartChange - allChangeInCoins[num1 - 1];
            num1 = 0;
        }
        while (secondPartChange != 0);
        int num = 0;
        do {
            for (int i = 0; i < allChangeInCoins.length; i++) {
                if (firstPartChange >= allChangeInCoins[i]) {
                    num++;
                }
            }
            returnChangeInCoins[num - 1]++;
            firstPartChange = firstPartChange - allChangeInCoins[num - 1];
            num = 0;
        }
        while (firstPartChange != 0);
        return returnChangeInCoins;
    }
    public static int returnVector() {

        for (int i = 0; i < returnChangeInCoins.length; i++) {

            System.out.println(returnChangeInCoins[i]);
        }return 0;

    }

    static public void convert() {
        if (theChange > 0.99) {
            firstPartChange = (int) theChange * 100;
            secondPartChange = (int) (((theChange * 10) % 10) * 10);
        } else
            firstPartChange = (int) (theChange * 100);

    }
}