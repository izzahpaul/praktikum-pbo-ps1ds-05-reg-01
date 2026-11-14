package unguided;

public class HasilEksperimen implements Comparable<HasilEksperimen> {

    // Atribut private
    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    // Static variable untuk menghitung jumlah eksperimen
    private static int jumlahEksperimen = 0;

    // Constructor
    public HasilEksperimen(String namaModel,
                           double akurasi,
                           int waktuTraining) {

        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;

        jumlahEksperimen++;
    }

    // Getter
    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static method untuk mengambil jumlah eksperimen
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    // Menentukan format tampilan objek
    @Override
    public String toString() {
        return "Model=" + namaModel
                + ", akurasi=" + akurasi
                + ", waktu=" + waktuTraining + " detik";
    }

    // Sorting berdasarkan akurasi tertinggi
    @Override
    public int compareTo(HasilEksperimen other) {
        return Double.compare(
                other.akurasi, this.akurasi
        );
    }
}
