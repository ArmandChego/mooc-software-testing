package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    // Pruebas
    @Test
    public void testMirrorEnds_ShortReflection() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testMirrorEnds_SingleCharacterReflection() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    public void testMirrorEnds_FullReflection() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testMirrorEnds_NoReflection() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("abc"));
    }

    @Test
    public void testMirrorEnds_EmptyString() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testMirrorEnds_OddLengthReflection() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("abca"));
    }
}
