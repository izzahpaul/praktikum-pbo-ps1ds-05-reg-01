package guided;

public class Guided01 {
    public static void main(String[] args) {
        // cara 1
        int[] VarArray1;
        VarArray1 = new int[5];
        VarArray1[0] = 11;
        VarArray1[1] = 22;
        VarArray1[2] = 33;
        VarArray1[3] = 44;
        VarArray1[4] = 55;
        
        // cara 2
        int[] VarArray2 = new int[5];
        
        // cara 3
        int[] VarArray3 = {1,2,3,4,5};
        
        System.out.println(VarArray3[3]);
        
        // Array 2 Dimensi
        int [][] arr2d =  new int [2][2];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;
        System.out.println("Nilai baris 1 kolom 2: " + arr2d[0][1]);
    }
}
