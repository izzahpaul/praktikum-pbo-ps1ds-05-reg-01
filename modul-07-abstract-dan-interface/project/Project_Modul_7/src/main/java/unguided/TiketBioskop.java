package unguided;

public abstract class TiketBioskop implements ItemTransaksi {

    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    public TiketBioskop(String judulFilm,
                        double hargaDasar,
                        int jumlahKursi) {

        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // Abstract method
    public abstract double hitungTotalBayar();

    public abstract String getNamaTransaksi();

    // Implementasi kontrak dari interface
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}