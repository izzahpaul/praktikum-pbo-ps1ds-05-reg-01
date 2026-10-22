package unguided;

public class ModelKomputasi {
    private String namaModel;
    private int jumlahDataLatih;

    public ModelKomputasi(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getJumlahDataLatih() {
        return jumlahDataLatih;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + namaModel
                + " | Data latih: " + jumlahDataLatih);
    }

    // Menghitung biaya dasar
    public int hitungBiaya() {
        return jumlahDataLatih * 2;
    }

    // Method overloading: biaya berdasarkan epoch
    public int hitungBiaya(int epoch) {
        return jumlahDataLatih * epoch;
    }
}
