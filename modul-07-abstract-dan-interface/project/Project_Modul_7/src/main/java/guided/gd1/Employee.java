package guided.gd1;

public abstract class Employee {
    private String nama;
    
    public Employee(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
    // Setiap pegawai pasti punya gaji, tetapi rumusnya beda beda
    public abstract double earnings();
}
