package unguided.model;

public class Dataset {
    // Atribut private untuk menerapkan enkapsulasi

    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Penanda bahwa nilai numerik sudah ditetapkan
    private boolean barisSudahDiatur;
    private boolean kolomSudahDiatur;
    private boolean missingSudahDiatur;

    // Konstanta milik class
    public static final double BATAS_MISSING = 5.0;

    // Menghitung total object Dataset yang dibuat
    private static int totalDataset = 0;

    // Constructor tanpa parameter
    public Dataset() {
        this.nama = "";
        totalDataset++;
    }

    // Constructor dengan satu parameter
    public Dataset(String nama) {
        this();
        this.nama = nama;

        // Nilai numerik tetap menggunakan nilai default 0
        this.barisSudahDiatur = true;
        this.kolomSudahDiatur = true;
        this.missingSudahDiatur = true;
    }

    // Constructor lengkap
    public Dataset(String nama, int jumlahBaris,
            int jumlahKolom, int jumlahMissing) {
        this();
        this.nama = nama;

        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
    }

    // Getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter jumlah baris
    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        if (!barisSudahDiatur && jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
            this.barisSudahDiatur = true;
        }
    }

    // Getter dan setter jumlah kolom
    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (!kolomSudahDiatur && jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
            this.kolomSudahDiatur = true;
        }
    }

    // Getter dan setter jumlah missing
    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (!missingSudahDiatur && jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
            this.missingSudahDiatur = true;
        }
    }

    // Menghitung persentase missing value
    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0.0;
        }

        return (double) jumlahMissing / totalSel * 100.0;
    }

    // Memeriksa apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    // Getter static untuk mengetahui total object
    public static int getTotalDataset() {
        return totalDataset;
    }
}
