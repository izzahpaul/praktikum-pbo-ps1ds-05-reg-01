package unguided;

public class Main {

    public static void main(String[] args) {

        // Membuat array dengan tipe kelas induk
        ModelKomputasi[] daftarModel = {
            new ModelRegresi("Regresi Linier", 500, 4),
            new ModelKlasifikasi("Decision Tree", 800, 3),
            new ModelDeepLearning("Neural Network", 1000, 5, 3)
        };

        int totalBiaya = 0;

        // Menampilkan informasi dan biaya setiap model
        for (ModelKomputasi model : daftarModel) {
            model.tampilkanInfo();

            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");

            totalBiaya += biaya;
        }

        // Total biaya seluruh model
        System.out.println("Total biaya: " + totalBiaya);

        // Biaya 10 epoch untuk Neural Network
        System.out.println("Biaya 10 epoch (Neural Network): "
                + daftarModel[2].hitungBiaya(10));

        // Biaya 10 epoch untuk Regresi Linier
        System.out.println("Biaya 10 epoch (Regresi Linier): "
                + daftarModel[0].hitungBiaya(10));

        // Biaya 10 epoch dengan batch 50 untuk Regresi Linier
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];

        System.out.println(
                "Biaya 10 epoch batch 50 (Regresi Linier): "
                + regresi.hitungBiaya(10, 50)
        );
    }
}
