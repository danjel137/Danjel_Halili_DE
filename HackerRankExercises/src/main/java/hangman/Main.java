package hangman;



import java.io.IOException;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {


        Hangman h = new Hangman();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        FileWords fileWords = new FileWords();
        fileWords.readScoreFromFile();
        System.out.println("The Record for the less wrong choose is: "+Hangman.Record+"\n"
         + "There are 5 questions and you should not make more than 10 mistakes ");
        fileWords.readFromFileAndWriteToList();
        fileWords.readFromFileHelpWorldAndWriteToList();
        System.out.println("press 1 to start the game or 0 to exit");
        int a = input.nextInt();


                int num=0;
                while (a != 0) {
                   for(int i=0;i<5;i++) {
                       System.out.println("Round "+(i+1));
                       int save = random.nextInt(fileWords.list.size());
                       System.out.println(fileWords.listHelpWorld.get(save));
                       String st = fileWords.list.get(save);
                       h.toDO(h.addToCharArray(st));
                       fileWords.listHelpWorld.remove(save);
                       fileWords.list.remove(save);
                       if(Hangman.wrongAnswer>9){
                           System.out.println("Game over ,the number of errors has been reached, you cannot continue.");break;
                       }
                       System.out.println("You pass round "+(i+1) +" successfully");

                   }
                      System.out.println("Game over you have "+Hangman.wrongAnswer+" mistakes in total");
                      h.changeScore();
                      fileWords.writeScoreInFile();
                      Hangman.wrongAnswer=0;
                      System.out.println("Press 1 to start another game or 0 to left");
                      a = input.nextInt();

                    if(fileWords.list.size()==0) {

                        fileWords.readFromFileAndWriteToList();
                        fileWords.readFromFileHelpWorldAndWriteToList();
                    }
                }


        System.out.println("thank you!");
    }
}
