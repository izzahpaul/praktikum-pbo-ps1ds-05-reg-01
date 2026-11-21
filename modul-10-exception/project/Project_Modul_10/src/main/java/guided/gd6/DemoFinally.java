package guided.gd6;

public class DemoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] arr = {10, 11, 12};
        try {
            System.out.println(arr[x]);
            System.out.println("tidak ada exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ada Exception");
            try {
                System.out.println(arr[x - 4]);
            } catch (ArrayIndexOutOfBoundsException innerEx) {
                System.out.println("Exception lagi di dalam catch: indeks " + (x - 4) + " tidak valid");
            }
        } finally {
            System.out.println("program selesai");
        }
    }
}