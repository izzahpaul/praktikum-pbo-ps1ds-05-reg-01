package guided.gd3;

public class Main {
    public static void main(String[] args) {
       Payable.logTransaction("Sistem Pembayaran Diinisialisasi.");
       
       Payable[] items = new Payable[2];
       items[0] = new Invoice("Ram DDR 5 16 GB", 2, 2000000);
       items[1] = new SalariedEmployee("Budi", 5000000);
       
       for (Payable item : items){
           item.printRecipt();
       }
       
       Payable.logTransaction("Transaksi Selesai Diproses.");
    }
    
}
