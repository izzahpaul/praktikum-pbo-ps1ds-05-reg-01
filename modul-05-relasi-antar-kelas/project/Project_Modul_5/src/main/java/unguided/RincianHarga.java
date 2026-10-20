package unguided;

public class RincianHarga {

    private double hargaDasar;
    private double pajak;

    private static final double TARIF_PAJAK = 0.10;

    public RincianHarga(double hargaDasar) {
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * TARIF_PAJAK;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public double getPajak() {
        return pajak;
    }

    public double getHargaTotal() {
        return hargaDasar + pajak;
    }
}
