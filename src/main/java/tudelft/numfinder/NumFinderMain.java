package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        //nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        //nf.find(new int[] {5, 3, 10, 1}); //NumFinder sin modificar: Al desordenar los numeros funciona con normalidad

        nf.find(new int[] {4, 3, 2, 1});  //NumFinder modificado: Ahora funciona independientemente del orden

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
