package unguided;

public interface ItemTransaksi {
    // Kontrak method
    double getNominalBayar();

    String getNamaTransaksi();

    // Default method untuk mencetak rincian transaksi
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi()
                + " | Total: Rp" + getNominalBayar());
    }

    // Static method untuk mencatat aktivitas kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}
