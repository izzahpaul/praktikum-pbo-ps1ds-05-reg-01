package unguided;

public class PaketSnack implements ItemTransaksi {

    private String namaPaket;
    private int jumlahPorsi;
    private double hargaPerPorsi;

    public PaketSnack(String namaPaket,
                      int jumlahPorsi,
                      double hargaPerPorsi) {

        this.namaPaket = namaPaket;
        this.jumlahPorsi = jumlahPorsi;
        this.hargaPerPorsi = hargaPerPorsi;
    }

    @Override
    public double getNominalBayar() {
        return jumlahPorsi * hargaPerPorsi;
    }

    @Override
    public String getNamaTransaksi() {
        return "F&B Snack: " + namaPaket
                + " (" + jumlahPorsi + " x Rp"
                + hargaPerPorsi + ")";
    }
}