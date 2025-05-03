package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;

        // Recorrer hasta que los caracteres coincidan de extremo a extremo
        while (begin < end) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += string.charAt(begin);
                begin++;
                end--;
            } else {
                break;  // Terminar en caso no coinciden
            }
        }

        // Si los extremos son iguales y se llega al centro
        if (begin == end) {
            mirror += string.charAt(begin);  // Agregar el caracter central una vez
        }

        return mirror;
    }
}
