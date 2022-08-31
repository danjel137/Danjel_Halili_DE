package hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    static int wrongAnswer = 0;
    static int Record;


    public  void changeScore(){
        if(wrongAnswer< Record)
        {
            Record =wrongAnswer;
            System.out.println("Congratulation you brake the score now the score is "+wrongAnswer);
        }
        else if(Record ==wrongAnswer){
            System.out.println("Your mistakes are the same with the record you almost brake it");
        }
    }
    public char[] addToCharArray(String str) {
        char []chars=str.toCharArray();
        return chars;
    }


    public boolean compare(char[]v1,char[] v2){
        boolean isSame = Arrays.equals(v1, v2);
        return isSame;
    }

    public char[] toDO(char[] ch) {
        char[] emptyArray = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            emptyArray[i] = '_';
            System.out.print(emptyArray[i]);
        }

        Scanner input = new Scanner(System.in);
        char enterCharToFill = input.next().charAt(0);
        char[] ArrayWithChar = ch;

        int temp = 0;
        while (!compare(ArrayWithChar, emptyArray)) {
            for (int i = 0; i < ArrayWithChar.length; i++) {
                if (ArrayWithChar[i] == enterCharToFill) {

                    emptyArray[i] = enterCharToFill;
                    temp++;
                }
            }
            if (temp==0)
            wrongAnswer++;
            temp = 0;
            for (char c : emptyArray) {
                System.out.print(c);
            }
            if(compare(ArrayWithChar, emptyArray)){break;}
            enterCharToFill = input.next().charAt(0);
        }


        System.out.println("\n"+"you have " + wrongAnswer + " mistakes");

        return ArrayWithChar;
    }
//    Random random = new Random();
//    Scanner scanner=new Scanner(System.in);
//    FileWords fileWords = new FileWords();
//    public void entryGameToPlay(){
//        String st;
//        for(int i=0;i<3;i++){
//            //scanner.nextInt();
//            int save = random.nextInt(fileWords.list.size());
//            System.out.println(fileWords.listHelpWorld.get(save));
//            st = fileWords.list.get(save);
//            toDO(addToCharArray(st));
//            fileWords.listHelpWorld.remove(save);
//            fileWords.list.remove(save);
//            System.out.println("press 1 to start the game or 0 to left");
//
//        }
//        System.out.println(mistake);
//    }

}
