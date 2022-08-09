import java.util.Scanner;
public class VendingMachine {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            change(input.nextDouble(), input.nextDouble());
            //change(5, 0.7);
            convert();


            int num = 0;
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


            returnVector();

        }

        static int[] allChangeInCoins = new int[]{1, 5, 10, 25, 50, 100};
        static int[] returnChangeInCoins = new int[]{0, 0, 0, 0, 0, 0};
        static double theChange;//total//5


        static double firstPartChange;//plote//400

        static double secondPartChange;//mbetur//30


        public static void change(double m, double p) {
            theChange = m - p;

        }

        public static void returnVector() {

            for (int i = 0; i < returnChangeInCoins.length; i++) {

                System.out.println(returnChangeInCoins[i]);
            }

        }

        static public void convert() {
            if (theChange > 0.99) {
                firstPartChange = (int) theChange * 100;
                secondPartChange = (int) (((theChange * 10) % 10) * 10);
//            System.out.println(firstPartChange);
//            System.out.println(secondPartChange);
            } else
                firstPartChange = (int) (theChange * 100);



        }
    }

