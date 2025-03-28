package tudelft.caesarshift;

public class CaesarShiftCipher {

    // Se corrigio el nombre del metodo para evitar conflicto con el constructor
    // El metodo tenia el mismo nombre que la clase, lo que hacia que Java lo interpretara como un constructor
    public String encrypt(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        int length = message.length();

        shift = shift % 26;

        for (int i = 0; i < length; i++) {
            char currentChar = message.charAt(i);

            // Se valida que el caracter sea una letra minuscula o un espacio
            if (currentChar < 'a' || currentChar > 'z') {
                if (currentChar == ' ') {
                    sb.append(' '); // Se mantienen los espacios
                } else {
                    return "invalid"; // Se descartan caracteres no validos
                }
            } else {
                // Se aplica el desplazamiento
                char shiftedChar = (char) (currentChar + shift);

                // Se ajusta si sobrepasa 'z' o cae antes de 'a'
                // Antes: Se aplicaban cambios incorrectos a currentChar sin modificar correctamente el resultado final
                if (shiftedChar > 'z') {
                    shiftedChar -= 26;
                } else if (shiftedChar < 'a') {
                    shiftedChar += 26;
                }

                sb.append(shiftedChar);
            }
        }

        return sb.toString();
    }
}
