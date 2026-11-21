package guided.gd4;

public class DemoMultipleCatch {
    public static void main(String[] args) {
        try {
            int x = 3;
            int y = 100 / x;

            int[] arr = {10, 11};
            y = arr[x];

            System.out.println("tidak ada eksepsi");
        } catch (ArithmeticException e) {
            // to do : handle exception
            System.out.println("Exception karena tidak bisa dibagi dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception karena indeks tidak valid");
        }

        System.out.println("Program Selesai");
    }
}