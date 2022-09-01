package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWords {
    static List <String>list =new ArrayList<>();
    static List <String>listHelpWorld =new ArrayList<>();
    public void readFromFileAndWriteToList() throws FileNotFoundException {
        File file = new File("HackerRankExercises/src/main/resources/Word");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }scanner.close();
    }
    public void readFromFileHelpWorldAndWriteToList() throws FileNotFoundException {
            File file1=new File("HackerRankExercises/src/main/resources/HelpWord");
            Scanner scanner=new Scanner(file1);
            while(scanner.hasNext()){
                listHelpWorld.add(scanner.nextLine());
            }scanner.close();
    }
    public void readScoreFromFile() throws FileNotFoundException {
        File file=new File("HackerRankExercises/src/main/resources/Score");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            Hangman.Record = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
    }
    public void writeScoreInFile() throws IOException {
        FileWriter file=new FileWriter("HackerRankExercises/src/main/resources/Score");
        String st= String.valueOf(Hangman.Record);
        file.write(st);
        file.close();
    }
}
