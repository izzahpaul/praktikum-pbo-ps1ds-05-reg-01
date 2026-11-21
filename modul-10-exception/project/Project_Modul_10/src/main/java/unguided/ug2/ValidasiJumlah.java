package unguided.ug2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidasiJumlah {

    // Method untuk memeriksa jumlah barang
    public static void cekJumlah(int qty) throws Exception {

        if (qty <= 0) {
            throw new Exception(
                "Jumlah barang minimal harus 1."
            );
        }

        System.out.println(
            "Jumlah barang valid: " + qty + " pcs."
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print(
                "Masukkan jumlah barang yang dibeli: "
            );

            int qty = input.nextInt();

            cekJumlah(qty);

        } catch (InputMismatchException e) {
            System.out.println(
                "Error: Input harus berupa angka bulat."
            );

        } catch (Exception e) {
            System.out.println(
                "Validasi gagal: " + e.getMessage()
            );
        }
    }
}