package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testGHappyBeforeFix() {
        GHappy gHappy = new GHappy();
        Assertions.assertEquals(false, gHappy.gHappy("xxgxx"));
        Assertions.assertEquals(true, gHappy.gHappy("xxggxx"));
        Assertions.assertEquals(false, gHappy.gHappy("xxggyygxx"));
    }

    @Test
    public void testGHappyAfterFix() {
        GHappy gHappy = new GHappy();
        Assertions.assertEquals(true, gHappy.gHappy("gg")); // Todas las 'g' son felices
        Assertions.assertEquals(true, gHappy.gHappy("xxggxx"));
        Assertions.assertEquals(false, gHappy.gHappy("g"));
        Assertions.assertEquals(false, gHappy.gHappy("xgx")); // 'g' infeliz entre otras letras
        Assertions.assertEquals(true, gHappy.gHappy("")); // Caso cadena vacia
        Assertions.assertEquals(true, gHappy.gHappy("abc")); // Caso sin 'g'
    }
}