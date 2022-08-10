package lesson3;

import java.util.Arrays;

public class LetterCounter {
  static final String VOCALS = "aeiou";

  static String myText = "There also could occur errors during search or poison application " +
                        "Or the search could take a very long time because the ants hide very well";

  public static void main(String[] args) {
    System.out.println(Arrays.toString(myText.split("")));
    // TO DO - find 2 other ways to create a stream of chars from a string !!!!
    // ex myText.getChars();



    System.out.println(myText.chars()
            .mapToObj(i -> (char)i)
            .filter(l->VOCALS.indexOf(l)>=0)
            .count());

    char[] ch = new char[139];
    try{
      myText.getChars(0, 139, ch, 0);
      System.out.println(ch);

    }catch(Exception ex){System.out.println(ex);}



    long vc = Arrays.stream(myText.split(""))
        .filter(a -> VOCALS.contains(a))
        .count();
    System.out.println(vc);
    System.out.println(myText.length() - vc);
    System.out.println(Arrays.stream(myText.split(""))
        .filter(l -> VOCALS.indexOf(l) < 0)
        .count());
  }
}
