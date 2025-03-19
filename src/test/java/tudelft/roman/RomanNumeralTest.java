package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result); //Funciona correctamente
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIIII"); // Lo correcto seria IX para representar el 9
        Assertions.assertEquals(9, result); //Aunque de igual forma con "VIIII" lo toma como un 9, lo cual es incorrecto
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IIX"); // Cuando se agrega un "I" extra solo considera el numero romano posterior al "I"
        Assertions.assertEquals(10, result); //Se retorna 10 ya que se anulan los "II" al haber mas de 1, tomando solo en cuenta el "X"
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIIIIVI"); // En este caso para el primer numero solo considera correctamente "VIII"
        Assertions.assertEquals(13, result); // Para el segundo numero resta el "I" anterior al "V" y luego suma de nuevo "I"
    }
}