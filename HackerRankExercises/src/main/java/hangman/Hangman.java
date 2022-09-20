package hangman;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    int wrongAnswer = 0;
    int record = 0;


    public void checkAndSetRecordScore() {
        if (wrongAnswer < record) {
            record = wrongAnswer;
            System.out.println("Congratulation you brake the score now the score is " + wrongAnswer);
        } else if (record == wrongAnswer) {
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

    public void doThis() throws IOException {


        Hangman h = new Hangman();

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        FileWords fileWords = new FileWords();
        fileWords.readScoreFromFile(h);
        System.out.println("The Record for the less wrong choose is: " + h.record + "\n"
                + "There are 5 questions and you must not make more than 10 mistakes ");
        fileWords.readFromFileAndWriteToList();
        fileWords.readFromFileHelpWorldAndWriteToList();
        System.out.println("press 1 to start the game or 0 to exit");
        int a = input.nextInt();


        while (a != 0) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Round " + (i + 1));
                int save = random.nextInt(FileWords.list.size());
                System.out.println(FileWords.listHelpWorld.get(save));
                String st = FileWords.list.get(save);
                h.toDO(h.addToCharArray(st));
                FileWords.listHelpWorld.remove(save);
                FileWords.list.remove(save);
                if (h.wrongAnswer > 9) {
                    System.out.println("Sorry you failed ,the number of errors has been reached, you cannot continue.");
                    break;
                }
                System.out.println("You pass round " + (i + 1) + " successfully");
                if (FileWords.list.size() == 0) {

                    fileWords.readFromFileAndWriteToList();
                    fileWords.readFromFileHelpWorldAndWriteToList();
                }
            }
            System.out.println("Game over you have " + h.wrongAnswer + " mistakes in total");
            h.checkAndSetRecordScore();
            fileWords.writeScoreInFile(h);
            h.wrongAnswer = 0;
            System.out.println("Press 1 to start another game or 0 to left");
            a = input.nextInt();

        }

        System.out.println("thank you!");
    }


}





