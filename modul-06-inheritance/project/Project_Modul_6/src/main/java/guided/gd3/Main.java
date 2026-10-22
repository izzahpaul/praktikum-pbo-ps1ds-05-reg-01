package guided.gd3;

public class Main {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();
        d.IsiParam("Lagu 1");
        e.IsiParam("Dunia Yang Nanti", "Raim Laode");
        d.tampilkan();
        e.tampilkan();
    }
}

