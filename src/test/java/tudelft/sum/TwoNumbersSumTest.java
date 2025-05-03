package tudelft.sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void testSumWithoutCarry() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(2); // Representa el numero 12

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(2);
        number2.add(3); // Representa el numero 23

        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(5); // Representa el numero 35

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithCarry() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(9);
        number1.add(9); // Representa el numero 99

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(1); // Representa el numero 11

        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(1);
        expectedResult.add(0); // Representa el numero 110

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithDifferentLength() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(9); // Representa el numero 9

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(1); // Representa el numero 11

        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);  // Representa el numero 20
        expectedResult.add(0);

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(number1, number2);
        assertEquals(expectedResult, result);
    }
}
