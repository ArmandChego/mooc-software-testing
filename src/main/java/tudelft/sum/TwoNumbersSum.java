package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Se empieza desde el ultimo digito de ambos numeros
        int i = first.size() - 1;
        int j = second.size() - 1;

        while (i >= 0 || j >= 0 || complement != 0) {
            int firstVal = (i >= 0) ? first.get(i--) : 0; // Si hay elementos en 'first', se toma el valor, sino 0
            int secondVal = (j >= 0) ? second.get(j--) : 0; // Si hay elementos en 'second', se toma el valor, sino 0

            int total = firstVal + secondVal + complement;
            complement = total / 10;
            result.add(total % 10); // Se guarda solo el digito menos significativo

        }

        // El resultado esta en orden inverso, por lo que se invierte la lista
        Collections.reverse(result);

        return result;
    }
}
