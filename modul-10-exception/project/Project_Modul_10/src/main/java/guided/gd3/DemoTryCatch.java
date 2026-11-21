package guided.gd3;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[1];

            System.out.println(arr[1]);
            System.out.println("Baris ini tidak pernah dieksekusi");
        } catch (ArrayIndexOutOfBoundsException e) {
            // to do : handle exception
            System.out.println("Terjadi eksepsi karena indeks tidak valid");
        }
        System.out.println("Program Selesai");
    }
}