package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testPositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.encrypt("abc", 3));
        assertEquals("abc", cipher.encrypt("xyz", 3));
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.encrypt("abc", -3));
        assertEquals("uvw", cipher.encrypt("xyz", -3));
    }

    @Test
    public void testZeroShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.encrypt("abc", 0));
    }

    @Test
    public void testWrapAroundPositive() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.encrypt("xyz", 3));
    }

    @Test
    public void testWrapAroundNegative() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.encrypt("abc", -3));
    }

    @Test
    public void testWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def ghi", cipher.encrypt("abc def", 3));
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.encrypt("abc123", 3));
        assertEquals("invalid", cipher.encrypt("hola!", 5));
    }
}
