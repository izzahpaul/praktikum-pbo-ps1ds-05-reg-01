package unguided;

public class ModelKlasifikasi extends ModelKomputasi {

    private int jumlahKelas;

    public ModelKlasifikasi(String namaModel, int jumlahDataLatih,
            int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }
}
    
