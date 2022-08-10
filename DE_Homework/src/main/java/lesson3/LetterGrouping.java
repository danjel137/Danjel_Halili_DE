package lesson3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterGrouping {
  static final String VOCALS = "aeiou";

  static String myText = "There also could occur errors during search or poison application Or the search could take a very long time because the ants hide very well";

  public static void main(String[] args) {
    Map<String, Long> res = Arrays.stream(myText.split(""))
        .collect((Collectors.groupingBy(c -> "aeiou".contains(c) ? "vocals":"non vocals", Collectors.counting())));
    System.out.println(res);

    long sumValues=  Arrays.stream(myText.split("")).count();
    System.out.println(sumValues);//the sum of how many characters are in the string


    int sumIndex = IntStream.range(0,myText.length()).filter(c -> "aeiou".contains(myText.charAt(c)+"")).sum();
    System.out.println(sumIndex);//sum of indexes when it contains string

    int sumIndex1=IntStream.range(0,myText.length()).filter(l -> (VOCALS.indexOf(myText.charAt(l)+"" )< 0)).sum();
    System.out.println(sumIndex1);//the sum of the indexes when it does not contain the string\


    //Exercise -
    // Calculate the sum of the char values
    // Calculate the sum of the char positions
    // A op B = B op A     AND  A op (B op C) = (A op C) op C
  }
}
