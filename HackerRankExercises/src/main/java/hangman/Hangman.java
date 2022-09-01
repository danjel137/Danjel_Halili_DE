package hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    static int wrongAnswer = 0;
    static int Record;


    public void changeScore() {
        if (wrongAnswer < Record) {
            Record = wrongAnswer;
            System.out.println("Congratulation you brake the score now the score is " + wrongAnswer);
        } else if (Record == wrongAnswer) {
            System.out.println("Your mistakes are the same with the record you almost brake it");
        }
    }

    public char[] addToCharArray(String str) {
        return str.toCharArray();
    }


    public boolean compare(char[] v1, char[] v2) {
        return Arrays.equals(v1, v2);
    }

    public char[] createEmptyCharArray(char[] ch) {
        char[] emptyArray = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            emptyArray[i] = '_';
            System.out.print(emptyArray[i]);
        }
        return emptyArray;
    }


    public char[] toDO(char[] ch) {


        Scanner input = new Scanner(System.in);
        char[] emptyArray = createEmptyCharArray(ch);

        char enterCharToFill = input.next().charAt(0);

        int temp = 0;
        while (!compare(ch, emptyArray)) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == enterCharToFill) {

                    emptyArray[i] = enterCharToFill;
                    temp++;
                }
            }
            if (temp == 0)
                wrongAnswer++;
            temp = 0;

            System.out.print(emptyArray);

            if (compare(ch, emptyArray)) {
                break;
            }
            enterCharToFill = input.next().charAt(0);
        }


        System.out.println("\n" + "you have " + wrongAnswer + " mistakes");

        return ch;
    }


}





