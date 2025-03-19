package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        for(int n : nums) {

            if(n < smallest)
                smallest = n;
            if (n > largest) // Se removio el "else" para que se pueda evaluar la condicion
                largest = n;  // El "else" no dejaba actualizar largest en algunos casos

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
