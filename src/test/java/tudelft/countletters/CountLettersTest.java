package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void wordEndingInR() {
        int words = new CountLetters().count("tiger");
        Assertions.assertEquals(1, words); //Falla porque "r" no esta en la condicion final
    }

    @Test
    public void wordEndingInX() {
        int words = new CountLetters().count("relax");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void noMatchingWords() {
        int words = new CountLetters().count("hola");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void nonLetterAfterNonMatchingLetter() {
        int words = new CountLetters().count("cat|");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void symbolAfterR() {
        int words = new CountLetters().count("tiger|");
        Assertions.assertEquals(1, words);
    }

}