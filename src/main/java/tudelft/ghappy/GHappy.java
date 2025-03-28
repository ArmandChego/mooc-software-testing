package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                // Se corrigio la condicion que verificaba la posicion i-1
                // ya que cuando i == 0, intentaba acceder a str.charAt(-1), lo cual causaba el error
                if (i > 0 && str.charAt(i-1) == 'g') { continue; } // Se cambio i >= 0 por i > 0
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
