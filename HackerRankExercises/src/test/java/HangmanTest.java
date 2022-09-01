import hangman.Hangman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HangmanTest {
    Hangman hangman;
    String string;
    char[] vectorWithChar = new char[6];
    char[] vectorWithChar1=new char[6];
    char[] vectorWithChar2 = new char[6];
    @BeforeEach
    public void init() {
     hangman = new Hangman();
     string = "office";
     vectorWithChar = new char[]{'o', 'f', 'f', 'i', 'c', 'e'};
     vectorWithChar1 = new char[]{'o', 'f', 'f', 'i', 'c', 'e'};
     vectorWithChar2 = new char[]{'_', '_', '_', '_', '_', '_'};
    }

    @Test
    public void testAddToCharArray() {
        assertArrayEquals(vectorWithChar, hangman.addToCharArray(string));
    }

    @Test
    public void compareTwoArray() {
        assertTrue(hangman.compare(vectorWithChar1,vectorWithChar));
    }

    @Test
    public void testToCreateEmptyArray() {
        assertArrayEquals(vectorWithChar2, hangman.createEmptyCharArray(vectorWithChar));
    }
//    @Test
//    public void testToDoMethod(){
//        assertArrayEquals(vectorWithChar,hangman.toDO(hangman.createEmptyCharArray(string.toCharArray());
//    }


}
