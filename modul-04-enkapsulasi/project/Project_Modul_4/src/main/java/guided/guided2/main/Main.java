package guided.guided2.main;

import guided.guided2.hargatoken.HargaToken;
import guided.guided2.hargapulsa.HargaPulsa;

public class Main {
    public static void main(String[] args) {
        HargaToken objectToken = new HargaToken();
        objectToken.info();
        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}
