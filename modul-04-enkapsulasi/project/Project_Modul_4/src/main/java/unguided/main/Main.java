package unguided.main;

import unguided.model.Dataset;
import unguided.laporan.LaporanDataset;



public class Main {

    public static void main(String[] args) {

        // Object 1: constructor tanpa parameter
        Dataset dataset1 = new Dataset();

        // Mengisi atribut menggunakan setter
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Object 2: constructor dengan satu parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Object 3: constructor lengkap
        Dataset dataset3 = new Dataset(
                "Iris", 150, 5, 0
        );

        // Menyimpan semua object dalam array
        Dataset[] daftarDataset = {
            dataset1, dataset2, dataset3
        };

        // Membuat object untuk mencetak laporan
        LaporanDataset laporan = new LaporanDataset();

        // Menampilkan laporan seluruh dataset
        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
            System.out.println();
        }

        // Mengambil total object tanpa membuat object baru
        System.out.println("Total dataset dibuat : "
                + Dataset.getTotalDataset());
    }
}
