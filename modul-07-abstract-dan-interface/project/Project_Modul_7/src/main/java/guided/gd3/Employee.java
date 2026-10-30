package guided.gd3;

public abstract class Employee implements Payable {
    private String nama;
    
    public Employee(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
    // Setiap pegawai pasti punya gaji, tetapi rumusnya beda beda
    public abstract double earnings();
    
    // saat ada penagihan, alihkan langsung ke metode kalkulasi gaji(earnings)
    @Override
    public double getPaymentAmount(){
        return earnings();
    }
}
