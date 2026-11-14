package unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Membuat List menggunakan Generics
        List<HasilEksperimen> daftarModel =
                new ArrayList<>();

        // Menambahkan data eksperimen
        daftarModel.add(new HasilEksperimen(
                "Logistic Regression", 0.82, 12));

        daftarModel.add(new HasilEksperimen(
                "Random Forest", 0.91, 45));

        daftarModel.add(new HasilEksperimen(
                "SVM", 0.87, 60));

        daftarModel.add(new HasilEksperimen(
                "KNN", 0.79, 5));

        daftarModel.add(new HasilEksperimen(
                "Decision Tree", 0.84, 8));

        // 1. Menampilkan jumlah eksperimen
        System.out.println("Jumlah eksperimen: "
                + HasilEksperimen.getJumlahEksperimen());

        // 2. Sorting berdasarkan akurasi tertinggi
        Collections.sort(daftarModel);

        System.out.println();
        System.out.println("Sorted by akurasi");

        for (HasilEksperimen model : daftarModel) {
            System.out.println(model);
        }

        // 3. Sorting berdasarkan waktu training
        Collections.sort(
                daftarModel,
                new WaktuTrainingComparator()
        );

        System.out.println();
        System.out.println("Sorted by waktu training");

        for (HasilEksperimen model : daftarModel) {
            System.out.println(model);
        }

        // 4. Filtering akurasi minimal 0.85
        System.out.println();
        System.out.println(
                "Model dengan akurasi minimal 0.85"
        );

        daftarModel.stream()
                .filter(model -> model.getAkurasi() >= 0.85)
                .forEach(System.out::println);

        // 5. Pencarian model KNN menggunakan Lambda
        System.out.println();
        System.out.println("Pencarian model KNN");

        HasilEksperimen hasilKNN = daftarModel.stream()
                .filter(model ->
                        model.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);

        System.out.println(hasilKNN);
    }
}
