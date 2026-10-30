package unguided;

public class Main {

    public static void main(String[] args) {

        // Uji proteksi abstraksi:
        // TiketBioskop tiket = new TiketBioskop(
        //     "Film", 40000, 2
        // );

        // Membuka transaksi kasir
        ItemTransaksi.catatLogKasir(
                "Membuka transaksi baru untuk Pelanggan #042."
        );

        // Membuat objek tiket reguler
        TiketReguler reguler = new TiketReguler(
                "Interstellar", 40000, 2, 3
        );

        // Membuat objek tiket VIP
        TiketVIP vip = new TiketVIP(
                "Dune: Part Two", 60000, 2, 25000
        );

        // Membuat objek paket snack
        PaketSnack snack = new PaketSnack(
                "Combo Popcorn Caramel + 2 Soda", 1, 55000
        );

        // Menyimpan semua transaksi dalam array heterogen
        ItemTransaksi[] daftarTransaksi = {
            reguler, vip, snack
        };

        double totalTransaksi = 0;

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        // Menampilkan rincian dan menghitung total pembayaran
        for (ItemTransaksi item : daftarTransaksi) {

            item.cetakRincianItem();

            totalTransaksi += item.getNominalBayar();
        }

        System.out.println(
                "-------------------------------------------------------------"
        );

        // Menampilkan total seluruh transaksi
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);

        System.out.println(
                "============================================================="
        );

        // Menutup transaksi kasir
        ItemTransaksi.catatLogKasir(
                "Transaksi #042 selesai diproses."
        );
    }
}